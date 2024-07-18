package demo;

import java.util.*;

public class RouteCalculator {

    private RouteCalculator() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static List<List<Station>> findAllRoutes(String startStation, String endStation, Map<String, Station> stationMap, Map<String, List<String>> connections) {
        List<List<Station>> allRoutes = new ArrayList<>();
        RouteContext context = new RouteContext(stationMap, connections, new HashSet<>(), new LinkedList<>(), new HashSet<>());
        findAllRoutesHelper(startStation.toLowerCase(), endStation.toLowerCase(), context, allRoutes);
        return allRoutes;
    }

    private static void findAllRoutesHelper(String current, String endStation, RouteContext context, List<List<Station>> allRoutes) {
        context.visited.add(current);
        context.path.add(context.stationMap.get(current));
        String currentLine = context.stationMap.get(current).getLine();

        if (current.equals(endStation)) {
            allRoutes.add(new ArrayList<>(context.path));
        } else {
            for (String neighbor : context.connections.get(current)) {
                String neighborLine = context.stationMap.get(neighbor.toLowerCase()).getLine();
                if (!context.visited.contains(neighbor.toLowerCase()) && (currentLine.equals(neighborLine) || !context.visitedLines.contains(neighborLine))) {
                    context.visitedLines.add(currentLine);
                    findAllRoutesHelper(neighbor.toLowerCase(), endStation, context, allRoutes);
                    context.visitedLines.remove(currentLine);
                }
            }
        }

        context.path.removeLast();
        context.visited.remove(current);
    }

    public static List<List<Station>> getTwoShortestRoutes(String startStation, String endStation, Map<String, Station> stationMap, Map<String, List<String>> connections) {
        List<List<Station>> allRoutes = findAllRoutes(startStation, endStation, stationMap, connections);
        allRoutes.sort(Comparator.comparingInt(List::size));

        List<List<Station>> shortestRoutes = new ArrayList<>();
        Set<Set<Station>> uniqueRoutes = new HashSet<>();

        for (List<Station> route : allRoutes) {
            Set<Station> routeSet = new HashSet<>(route);
            if (uniqueRoutes.add(routeSet)) {
                shortestRoutes.add(route);
            }
            if (shortestRoutes.size() == 2) {
                break;
            }
        }

        return shortestRoutes;
    }

    private static class RouteContext {
        Map<String, Station> stationMap;
        Map<String, List<String>> connections;
        Set<String> visited;
        LinkedList<Station> path;
        Set<String> visitedLines;

        RouteContext(Map<String, Station> stationMap, Map<String, List<String>> connections, Set<String> visited, LinkedList<Station> path, Set<String> visitedLines) {
            this.stationMap = stationMap;
            this.connections = connections;
            this.visited = visited;
            this.path = path;
            this.visitedLines = visitedLines;
        }
    }
}
