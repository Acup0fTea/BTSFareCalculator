package demo;

import java.util.List;

public class CalculateTime {

    private CalculateTime() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static int calculateTime(List<Station> route) {
        if (route == null || route.isEmpty()) {
            return 0;
        }

        return (int) Math.round(1.8 * route.size());
    }
}
