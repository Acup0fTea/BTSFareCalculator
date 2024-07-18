package demo;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BTSFareCalculator {
    public static void main(String[] args) {
        Station[] allStations = AllStations.getAllStations();
        Map<String, Station> stationMap = StationMap.initializeStationMap(allStations);
        Map<String, List<String>> connections = Connections.initializeConnections();

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting station code: ");
        String startStation = scanner.nextLine().toLowerCase();
        System.out.print("Enter destination station code: ");
        String endStation = scanner.nextLine().toLowerCase();

        // Calculate routes
        List<List<Station>> routes = RouteCalculator.getTwoShortestRoutes(startStation, endStation, stationMap, connections);
        scanner.close();

        if (!routes.isEmpty()) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalTime now = LocalTime.now();

            List<RouteInfo> routeInfos = calculateRouteInfos(routes, now);

            // Check if the number of stations in route 1 and route 2 are the same
            if (routeInfos.size() > 1 && routeInfos.get(0).route.size() == routeInfos.get(1).route.size()) {
                swapRoutesIfSecondFareIsLower(routeInfos);
            }

            printRouteInfos(routeInfos, startStation, endStation, now, formatter);
        } else {
            System.out.println("No routes found.");
        }
    }

    private static List<RouteInfo> calculateRouteInfos(List<List<Station>> routes, LocalTime now) {
        List<RouteInfo> routeInfos = new ArrayList<>();

        for (int i = 0; i < routes.size(); i++) {
            List<Station> route = routes.get(i);
            int fare = FareCalculator.calculateFare(route);
            int time = CalculateTime.calculateTime(route);
            LocalTime reachTime = now.plusMinutes(time);

            routeInfos.add(new RouteInfo(route, fare, time, reachTime));
        }

        return routeInfos;
    }

    private static void swapRoutesIfSecondFareIsLower(List<RouteInfo> routeInfos) {
        if (routeInfos.get(1).fare < routeInfos.get(0).fare) {
            Collections.swap(routeInfos, 0, 1);
        }
    }

    private static void printRouteInfos(List<RouteInfo> routeInfos, String startStation, String endStation, LocalTime now, DateTimeFormatter formatter) {
        for (int i = 0; i < routeInfos.size(); i++) {
            RouteInfo info = routeInfos.get(i);
            System.out.println("Number of stations in route " + (i + 1) + ": " + info.route.size() + " stations.");
            System.out.println("Route " + (i + 1) + ":");
            for (int j = 0; j < info.route.size(); j++) {
                System.out.print(info.route.get(j).getName() + " (" + info.route.get(j).getCode().toUpperCase() + ")");
                if (j < info.route.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println("\nThe fare from " + startStation.toUpperCase() + " to " + endStation.toUpperCase() + " is: " + info.fare + " baht");
            System.out.println("The estimated travel time is: " + info.time + " minutes");
            System.out.println("Current time: " + now.format(formatter));
            System.out.println("Estimated reach time: " + info.reachTime.format(formatter));
            System.out.println("*********************************************************************");
        }
    }
}

