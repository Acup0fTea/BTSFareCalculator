package com.bts.training.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bts.training.entity.StationConnection;
import com.bts.training.repository.StationConnectionRepository;
import com.bts.training.repository.StationRepository;

@Service
public class ConnectionService {

    private final StationRepository stationRepository;
    private final StationConnectionRepository stationConnectionRepository;
    private final Connections connections;

    @Autowired
    public ConnectionService(StationRepository stationRepository, StationConnectionRepository stationConnectionRepository, Connections connections) {
        this.stationRepository = stationRepository;
        this.stationConnectionRepository = stationConnectionRepository;
        this.connections = connections;
    }

    @Transactional
    public void saveAllConnections() {
        List<StationConnection> allConnections = connections.getAllConnections();
        stationConnectionRepository.saveAll(allConnections);
    }

    public Map<String, List<String>> getConnectionsMap() {
        List<StationConnection> allConnections = connections.getAllConnections();
        return connections.convertToMap(allConnections);
    }
}
