// StationMap.java
package com.bts.training.service;

import java.util.HashMap;
import java.util.Map;

import com.bts.training.entity.Station;

public class StationMap {

    public static Map<String, Station> initializeStationMap(Station[] stations) {
        Map<String, Station> stationMap = new HashMap<>();
        for (Station station : stations) {
            stationMap.put(station.getCode().toLowerCase(), station);
        }
        return stationMap;
    }
}

