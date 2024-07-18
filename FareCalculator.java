package demo;

import java.util.ArrayList;
import java.util.List;

public class FareCalculator {

    private static final int[] NORMAL_FARE_RATES = {17, 25, 28, 32, 35, 40, 43, 47};
    private static final int EXTENSION_FARE = 15;
    private static final int GOLD_LINE_FARE = 16;
    private static final int MAX_FARE = 62;
    private static final int[] BLUE_LINE_FARE_RATES = {17, 20, 22, 25, 27, 30, 32, 35, 37, 40, 42, 45};
    private static final int[] ARL_FARE_RATES = {15, 20, 25, 30, 35, 40, 45};

    private FareCalculator() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static int calculateFare(List<Station> route) {
        if (route == null || route.isEmpty()) {
            return 0;
        }

        RouteInfo routeInfo = categorizeStations(route);

        int mainFare = calculateMainFare(routeInfo.normalCount, routeInfo.extensionCount);

        mainFare += calculateAdditionalFares(routeInfo);
        mainFare -= calculateDiscounts(routeInfo, route);

        return mainFare;
    }

    private static RouteInfo categorizeStations(List<Station> route) {
        RouteInfo routeInfo = new RouteInfo();

        for (Station station : route) {
            switch (station.getLine()) {
                case "gold":
                    routeInfo.includesGoldLine = true;
                    routeInfo.goldLineRoute.add(station);
                    break;
                case "pink":
                    routeInfo.includesPinkLine = true;
                    routeInfo.pinkLineRoute.add(station);
                    break;
                case "yellow":
                    routeInfo.includesYellowLine = true;
                    routeInfo.yellowLineRoute.add(station);
                    break;
                case "blue":
                    routeInfo.includesBlueLine = true;
                    routeInfo.blueLineRoute.add(station);
                    break;
                case "arl":
                    routeInfo.includesArlLine = true;
                    routeInfo.arlLineRoute.add(station);
                    break;
                case "purple":
                    routeInfo.includesPurpleLine = true;
                    routeInfo.purpleLineRoute.add(station);
                    break;
                default:
                    routeInfo.mainRoute.add(station);
                    if (station.getType().equals("normal")) {
                        routeInfo.normalCount++;
                    } else if (station.getType().equals("extension")) {
                        routeInfo.extensionCount++;
                    }
                    break;
            }
        }
        return routeInfo;
    }

    private static int calculateAdditionalFares(RouteInfo routeInfo) {
        int additionalFare = 0;
        if (routeInfo.includesGoldLine) {
            additionalFare += GOLD_LINE_FARE;
        }
        if (routeInfo.includesPinkLine) {
            additionalFare += getPinkLineFare(routeInfo.pinkLineRoute);
        }
        if (routeInfo.includesYellowLine) {
            additionalFare += getYellowLineFare(routeInfo.yellowLineRoute);
        }
        if (routeInfo.includesBlueLine) {
            additionalFare += calculateBlueLineFare(routeInfo.blueLineRoute.size() - 1);
        }
        if (routeInfo.includesArlLine) {
            additionalFare += calculateArlFare(routeInfo.arlLineRoute.size() - 1);
        }
        if (routeInfo.includesPurpleLine) {
            additionalFare += calculatePurpleLineFare(routeInfo.purpleLineRoute.size() - 1);
        }
        return additionalFare;
    }

    private static int calculateDiscounts(RouteInfo routeInfo, List<Station> route) {
        int discount = 0;
        boolean changedAtTaoPoon = routeInfo.includesBlueLine && routeInfo.includesPurpleLine && containsStation(route, "BL10") && containsStation(route, "PP16");
        boolean changedAtLadPhrao = routeInfo.includesBlueLine && routeInfo.includesYellowLine && containsStation(route, "BL15") && containsStation(route, "YL01");

        if (changedAtTaoPoon) {
            discount += 15;
        }
        if (changedAtLadPhrao) {
            discount += calculateLadPhraoDiscount(route);
        }
        return discount;
    }

    private static int getPinkLineFare(List<Station> pinkLineRoute) {
        String start = pinkLineRoute.get(0).getCode().toLowerCase();
        String end = pinkLineRoute.get(pinkLineRoute.size() - 1).getCode().toLowerCase();
        return PinkLineFares.getFare(start, end);
    }

    private static int getYellowLineFare(List<Station> yellowLineRoute) {
        String start = yellowLineRoute.get(0).getCode().toLowerCase();
        String end = yellowLineRoute.get(yellowLineRoute.size() - 1).getCode().toLowerCase();
        return YellowLineFares.getFare(start, end);
    }

    private static boolean containsStation(List<Station> route, String code) {
        return route.stream().anyMatch(station -> station.getCode().equals(code));
    }

    private static int calculateMainFare(int normalCount, int extensionCount) {
        if (normalCount > 0 && extensionCount > 0) {
            if (normalCount == 1) {
                return EXTENSION_FARE;
            } else {
                return getNormalFare(normalCount - 1) + EXTENSION_FARE;
            }
        } else if (normalCount > 0) {
            return getNormalFare(normalCount - 1);
        } else if (extensionCount > 0) {
            return Math.min(EXTENSION_FARE, MAX_FARE);
        }
        return 0;
    }

    private static int getNormalFare(int normalCount) {
        return NORMAL_FARE_RATES[Math.min(normalCount - 1, NORMAL_FARE_RATES.length - 1)];
    }

    private static int calculateBlueLineFare(int stations) {
        return stations >= BLUE_LINE_FARE_RATES.length ? BLUE_LINE_FARE_RATES[BLUE_LINE_FARE_RATES.length - 1] : BLUE_LINE_FARE_RATES[stations - 1];
    }

    private static int calculateArlFare(int stations) {
        return ARL_FARE_RATES[Math.min(stations - 1, ARL_FARE_RATES.length - 1)];
    }

    private static int calculatePurpleLineFare(int stations) {
        if (stations == 1) {
            return 16;
        } else if (stations == 2) {
            return 18;
        } else if (stations > 2) {
            return 20;
        }
        return 0;
    }

    private static int calculateLadPhraoDiscount(List<Station> route) {
        for (int i = 0; i < route.size() - 1; i++) {
            if ((route.get(i).getCode().equals("YL01") && route.get(i + 1).getCode().equals("BL15"))
                || (route.get(i).getCode().equals("BL15") && route.get(i + 1).getCode().equals("YL01"))) {
                return route.get(i).getCode().equals("YL01") ? 14 : 15;
            }
        }
        return 0;
    }

    private static class RouteInfo {
        boolean includesGoldLine = false;
        boolean includesPinkLine = false;
        boolean includesYellowLine = false;
        boolean includesBlueLine = false;
        boolean includesArlLine = false;
        boolean includesPurpleLine = false;
        int normalCount = 0;
        int extensionCount = 0;
        List<Station> mainRoute = new ArrayList<>();
        List<Station> pinkLineRoute = new ArrayList<>();
        List<Station> yellowLineRoute = new ArrayList<>();
        List<Station> blueLineRoute = new ArrayList<>();
        List<Station> arlLineRoute = new ArrayList<>();
        List<Station> goldLineRoute = new ArrayList<>();
        List<Station> purpleLineRoute = new ArrayList<>();
    }
}
