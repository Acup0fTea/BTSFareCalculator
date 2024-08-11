package com.bts.training.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bts.training.entity.Station;
import com.bts.training.entity.StationConnection;
import com.bts.training.repository.StationConnectionRepository;
import com.bts.training.repository.StationRepository;

@Service
public class Connections {

    @Autowired
    private StationRepository stationRepository;

    @Autowired
    private StationConnectionRepository stationConnectionRepository;

    public List<StationConnection> getAllConnections() {
        return stationConnectionRepository.findAll();
    }

    public Map<String, List<String>> initializeConnections() {
        Map<String, List<String>> connections = new HashMap<>();
        List<Station> allStations = stationRepository.findAll();
        for (Station station : allStations) {
            connections.put(station.getCode().toLowerCase(), new ArrayList<>());
        }

        List<StationConnection> stationConnections = stationConnectionRepository.findAll();
        for (StationConnection connection : stationConnections) {
            addConnection(connections, connection.getStationCode1().getCode(), connection.getStationCode2().getCode());
        }

        return connections;
    }

    private void addConnection(Map<String, List<String>> connections, String station_code1, String station_code2) {
        connections.get(station_code1.toLowerCase()).add(station_code2.toLowerCase());
        connections.get(station_code2.toLowerCase()).add(station_code1.toLowerCase());
    }

    public Map<String, List<String>> convertToMap(List<StationConnection> stationConnections) {
        Map<String, List<String>> connectionsMap = new HashMap<>();
        for (StationConnection connection : stationConnections) {
            addConnection(connectionsMap, connection.getStationCode1().getCode(), connection.getStationCode2().getCode());
        }
        return connectionsMap;
    }
}
