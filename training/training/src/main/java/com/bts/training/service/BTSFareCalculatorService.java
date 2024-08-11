package com.bts.training.service;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bts.training.entity.Station;
import com.bts.training.model.RouteInfo;
import com.bts.training.repository.StationRepository;

@Service
public class BTSFareCalculatorService {

    private static final Logger logger = Logger.getLogger(BTSFareCalculatorService.class.getName());

    @Autowired
    private StationRepository stationRepository;

    @Autowired
    private AllStations allStations;

    @Autowired
    private Connections connections;

    @Autowired
    private CalculateTime calculateTime;

    @Autowired
    private FareCalculator fareCalculator;

    public List<Station> getAllStations() {
        return allStations.getAllStations();
    }

    public RouteInfo calculateFare(String startStationCode, String endStationCode) {
        logger.info(String.format("Calculating fare from %s to %s", startStationCode, endStationCode));
        try {
            Station startStation = stationRepository.findByCode(startStationCode)
                    .orElseThrow(() -> new IllegalArgumentException("Invalid start station code: " + startStationCode));
            Station endStation = stationRepository.findByCode(endStationCode)
                    .orElseThrow(() -> new IllegalArgumentException("Invalid end station code: " + endStationCode));

            List<Station> allStations1 = allStations.getAllStations();
            Map<String, Station> stationMap = StationMap.initializeStationMap(allStations1.toArray(new Station[0]));
            Map<String, List<String>> connectionMap = connections.initializeConnections();

            List<List<Station>> routes = RouteCalculator.getTwoShortestRoutes(
                    startStation.getCode(),
                    endStation.getCode(),
                    stationMap,
                    connectionMap
            );

            if (!routes.isEmpty()) {
                return calculateRouteInfo(routes.get(0));
            } else {
                logger.warning(String.format("No route found from %s to %s", startStationCode, endStationCode));
                return null; // No route found
            }
        } catch (Exception e) {
            logger.severe("Error calculating fare: " + e.getMessage());
            throw e;
        }
    }

    private RouteInfo calculateRouteInfo(List<Station> route) {
        int fare = fareCalculator.calculateFare(route);
        int time = calculateTime.calculateTime(route);
        return new RouteInfo(route, fare, time);
    }
}
