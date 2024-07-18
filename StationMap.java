package demo;
import java.util.HashMap;
import java.util.Map;

public class StationMap {
    private StationMap() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
    public static Map<String, Station> initializeStationMap(Station[] allStations) {
        Map<String, Station> stationMap = new HashMap<>();
        for (Station station : allStations) {
            stationMap.put(station.getCode().toLowerCase(), station);
        }
        return stationMap;
    }
}
