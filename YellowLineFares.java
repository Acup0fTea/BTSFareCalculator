package demo;
import java.util.HashMap;
import java.util.Map;

public class YellowLineFares {
    
    private YellowLineFares() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
    private static final Map<String, Map<String, Integer>> fares = new HashMap<>();

    static {
        defineYellowLineFares();
    }

    public static int getFare(String start, String end) {
        return fares.get(start).get(end);
    }

    private static void defineYellowLineFares() {
        addYellowLineFare("YL01", "YL01", 15);
        addYellowLineFare("YL01", "YL02", 19);
        addYellowLineFare("YL01", "YL03", 23);
        addYellowLineFare("YL01", "YL04", 27);
        addYellowLineFare("YL01", "YL05", 30);
        addYellowLineFare("YL01", "YL06", 33);
        addYellowLineFare("YL01", "YL07", 36);
        addYellowLineFare("YL01", "YL08", 39);
        addYellowLineFare("YL01", "YL09", 42);
        addYellowLineFare("YL01", "YL10", 45);
        addYellowLineFare("YL01", "YL11", 45);
        addYellowLineFare("YL01", "YL12", 45);
        addYellowLineFare("YL01", "YL13", 45);
        addYellowLineFare("YL01", "YL14", 45);
        addYellowLineFare("YL01", "YL15", 45);
        addYellowLineFare("YL01", "YL16", 45);
        addYellowLineFare("YL01", "YL17", 45);
        addYellowLineFare("YL01", "YL18", 45);
        addYellowLineFare("YL01", "YL19", 45);
        addYellowLineFare("YL01", "YL20", 45);
        addYellowLineFare("YL01", "YL21", 45);
        addYellowLineFare("YL01", "YL22", 45);
        addYellowLineFare("YL01", "YL23", 45);

        addYellowLineFare("YL02", "YL02", 15);
        addYellowLineFare("YL02", "YL03", 19);
        addYellowLineFare("YL02", "YL04", 24);
        addYellowLineFare("YL02", "YL05", 26);
        addYellowLineFare("YL02", "YL06", 29);
        addYellowLineFare("YL02", "YL07", 31);
        addYellowLineFare("YL02", "YL08", 36);
        addYellowLineFare("YL02", "YL09", 39);
        addYellowLineFare("YL02", "YL10", 42);
        addYellowLineFare("YL02", "YL11", 45);
        addYellowLineFare("YL02", "YL12", 45);
        addYellowLineFare("YL02", "YL13", 45);
        addYellowLineFare("YL02", "YL14", 45);
        addYellowLineFare("YL02", "YL15", 45);
        addYellowLineFare("YL02", "YL16", 45);
        addYellowLineFare("YL02", "YL17", 45);
        addYellowLineFare("YL02", "YL18", 45);
        addYellowLineFare("YL02", "YL19", 45);
        addYellowLineFare("YL02", "YL20", 45);
        addYellowLineFare("YL02", "YL21", 45);
        addYellowLineFare("YL02", "YL22", 45);
        addYellowLineFare("YL02", "YL23", 45);

        addYellowLineFare("YL03", "YL03", 15);
        addYellowLineFare("YL03", "YL04", 21);
        addYellowLineFare("YL03", "YL05", 23);
        addYellowLineFare("YL03", "YL06", 26);
        addYellowLineFare("YL03", "YL07", 28);
        addYellowLineFare("YL03", "YL08", 31);
        addYellowLineFare("YL03", "YL09", 35);
        addYellowLineFare("YL03", "YL10", 39);
        addYellowLineFare("YL03", "YL11", 42);
        addYellowLineFare("YL03", "YL12", 45);
        addYellowLineFare("YL03", "YL13", 45);
        addYellowLineFare("YL03", "YL14", 45);
        addYellowLineFare("YL03", "YL15", 45);
        addYellowLineFare("YL03", "YL16", 45);
        addYellowLineFare("YL03", "YL17", 45);
        addYellowLineFare("YL03", "YL18", 45);
        addYellowLineFare("YL03", "YL19", 45);
        addYellowLineFare("YL03", "YL20", 45);
        addYellowLineFare("YL03", "YL21", 45);
        addYellowLineFare("YL03", "YL22", 45);
        addYellowLineFare("YL03", "YL23", 45);

        addYellowLineFare("YL04", "YL04", 15);
        addYellowLineFare("YL04", "YL05", 18);
        addYellowLineFare("YL04", "YL06", 22);
        addYellowLineFare("YL04", "YL07", 24);
        addYellowLineFare("YL04", "YL08", 27);
        addYellowLineFare("YL04", "YL09", 30);
        addYellowLineFare("YL04", "YL10", 33);
        addYellowLineFare("YL04", "YL11", 38);
        addYellowLineFare("YL04", "YL12", 42);
        addYellowLineFare("YL04", "YL13", 45);
        addYellowLineFare("YL04", "YL14", 45);
        addYellowLineFare("YL04", "YL15", 45);
        addYellowLineFare("YL04", "YL16", 45);
        addYellowLineFare("YL04", "YL17", 45);
        addYellowLineFare("YL04", "YL18", 45);
        addYellowLineFare("YL04", "YL19", 45);
        addYellowLineFare("YL04", "YL20", 45);
        addYellowLineFare("YL04", "YL21", 45);
        addYellowLineFare("YL04", "YL22", 45);
        addYellowLineFare("YL04", "YL23", 45);

        addYellowLineFare("YL05", "YL05", 15);
        addYellowLineFare("YL05", "YL06", 19);
        addYellowLineFare("YL05", "YL07", 22);
        addYellowLineFare("YL05", "YL08", 25);
        addYellowLineFare("YL05", "YL09", 28);
        addYellowLineFare("YL05", "YL10", 31);
        addYellowLineFare("YL05", "YL11", 36);
        addYellowLineFare("YL05", "YL12", 40);
        addYellowLineFare("YL05", "YL13", 44);
        addYellowLineFare("YL05", "YL14", 45);
        addYellowLineFare("YL05", "YL15", 45);
        addYellowLineFare("YL05", "YL16", 45);
        addYellowLineFare("YL05", "YL17", 45);
        addYellowLineFare("YL05", "YL18", 45);
        addYellowLineFare("YL05", "YL19", 45);
        addYellowLineFare("YL05", "YL20", 45);
        addYellowLineFare("YL05", "YL21", 45);
        addYellowLineFare("YL05", "YL22", 45);
        addYellowLineFare("YL05", "YL23", 45);

        addYellowLineFare("YL06", "YL06", 15);
        addYellowLineFare("YL06", "YL07", 18);
        addYellowLineFare("YL06", "YL08", 22);
        addYellowLineFare("YL06", "YL09", 25);
        addYellowLineFare("YL06", "YL10", 28);
        addYellowLineFare("YL06", "YL11", 32);
        addYellowLineFare("YL06", "YL12", 37);
        addYellowLineFare("YL06", "YL13", 41);
        addYellowLineFare("YL06", "YL14", 44);
        addYellowLineFare("YL06", "YL15", 39);
        addYellowLineFare("YL06", "YL16", 42);
        addYellowLineFare("YL06", "YL17", 45);
        addYellowLineFare("YL06", "YL18", 45);
        addYellowLineFare("YL06", "YL19", 45);
        addYellowLineFare("YL06", "YL20", 45);
        addYellowLineFare("YL06", "YL21", 45);
        addYellowLineFare("YL06", "YL22", 45);
        addYellowLineFare("YL06", "YL23", 45);
        addYellowLineFare("YL06", "YL24", 45);

        addYellowLineFare("YL07", "YL07", 15);
        addYellowLineFare("YL07", "YL08", 19);
        addYellowLineFare("YL07", "YL09", 23);
        addYellowLineFare("YL07", "YL10", 26);
        addYellowLineFare("YL07", "YL11", 30);
        addYellowLineFare("YL07", "YL12", 33);
        addYellowLineFare("YL07", "YL13", 39);
        addYellowLineFare("YL07", "YL14", 42);
        addYellowLineFare("YL07", "YL15", 45);
        addYellowLineFare("YL07", "YL16", 45);
        addYellowLineFare("YL07", "YL17", 45);
        addYellowLineFare("YL07", "YL18", 45);
        addYellowLineFare("YL07", "YL19", 45);
        addYellowLineFare("YL07", "YL20", 45);
        addYellowLineFare("YL07", "YL21", 45);
        addYellowLineFare("YL07", "YL22", 45);
        addYellowLineFare("YL07", "YL23", 45);

        addYellowLineFare("YL08", "YL08", 15);
        addYellowLineFare("YL08", "YL09", 18);
        addYellowLineFare("YL08", "YL10", 23);
        addYellowLineFare("YL08", "YL11", 27);
        addYellowLineFare("YL08", "YL12", 30);
        addYellowLineFare("YL08", "YL13", 35);
        addYellowLineFare("YL08", "YL14", 38);
        addYellowLineFare("YL08", "YL15", 41);
        addYellowLineFare("YL08", "YL16", 45);
        addYellowLineFare("YL08", "YL17", 45);
        addYellowLineFare("YL08", "YL18", 45);
        addYellowLineFare("YL08", "YL19", 45);
        addYellowLineFare("YL08", "YL20", 45);
        addYellowLineFare("YL08", "YL21", 45);
        addYellowLineFare("YL08", "YL22", 45);
        addYellowLineFare("YL08", "YL23", 45);

        addYellowLineFare("YL09", "YL09", 15);
        addYellowLineFare("YL09", "YL10", 19);
        addYellowLineFare("YL09", "YL11", 24);
        addYellowLineFare("YL09", "YL12", 27);
        addYellowLineFare("YL09", "YL13", 31);
        addYellowLineFare("YL09", "YL14", 35);
        addYellowLineFare("YL09", "YL15", 38);
        addYellowLineFare("YL09", "YL16", 42);
        addYellowLineFare("YL09", "YL17", 45);
        addYellowLineFare("YL09", "YL18", 45);
        addYellowLineFare("YL09", "YL19", 45);
        addYellowLineFare("YL09", "YL20", 45);
        addYellowLineFare("YL09", "YL21", 45);
        addYellowLineFare("YL09", "YL22", 45);
        addYellowLineFare("YL09", "YL23", 45);

        addYellowLineFare("YL10", "YL10", 15);
        addYellowLineFare("YL10", "YL11", 21);
        addYellowLineFare("YL10", "YL12", 24);
        addYellowLineFare("YL10", "YL13", 28);
        addYellowLineFare("YL10", "YL14", 31);
        addYellowLineFare("YL10", "YL15", 35);
        addYellowLineFare("YL10", "YL16", 39);
        addYellowLineFare("YL10", "YL17", 42);
        addYellowLineFare("YL10", "YL18", 45);
        addYellowLineFare("YL10", "YL19", 45);
        addYellowLineFare("YL10", "YL20", 45);
        addYellowLineFare("YL10", "YL21", 45);
        addYellowLineFare("YL10", "YL22", 45);
        addYellowLineFare("YL10", "YL23", 45);

        addYellowLineFare("YL11", "YL11", 15);
        addYellowLineFare("YL11", "YL12", 19);
        addYellowLineFare("YL11", "YL13", 24);
        addYellowLineFare("YL11", "YL14", 27);
        addYellowLineFare("YL11", "YL15", 30);
        addYellowLineFare("YL11", "YL16", 35);
        addYellowLineFare("YL11", "YL17", 38);
        addYellowLineFare("YL11", "YL18", 41);
        addYellowLineFare("YL11", "YL19", 45);
        addYellowLineFare("YL11", "YL20", 45);
        addYellowLineFare("YL11", "YL21", 45);
        addYellowLineFare("YL11", "YL22", 45);
        addYellowLineFare("YL11", "YL23", 45);

        addYellowLineFare("YL12", "YL12", 15);
        addYellowLineFare("YL12", "YL13", 21);
        addYellowLineFare("YL12", "YL14", 24);
        addYellowLineFare("YL12", "YL15", 27);
        addYellowLineFare("YL12", "YL16", 31);
        addYellowLineFare("YL12", "YL17", 33);
        addYellowLineFare("YL12", "YL18", 38);
        addYellowLineFare("YL12", "YL19", 42);
        addYellowLineFare("YL12", "YL20", 45);
        addYellowLineFare("YL12", "YL21", 45);
        addYellowLineFare("YL12", "YL22", 45);
        addYellowLineFare("YL12", "YL23", 45);

        addYellowLineFare("YL13", "YL13", 15);
        addYellowLineFare("YL13", "YL14", 18);
        addYellowLineFare("YL13", "YL15", 22);
        addYellowLineFare("YL13", "YL16", 27);
        addYellowLineFare("YL13", "YL17", 29);
        addYellowLineFare("YL13", "YL18", 33);
        addYellowLineFare("YL13", "YL19", 38);
        addYellowLineFare("YL13", "YL20", 41);
        addYellowLineFare("YL13", "YL21", 44);
        addYellowLineFare("YL13", "YL22", 45);
        addYellowLineFare("YL13", "YL23", 45);

        addYellowLineFare("YL14", "YL14", 15);
        addYellowLineFare("YL14", "YL15", 18);
        addYellowLineFare("YL14", "YL16", 24);
        addYellowLineFare("YL14", "YL17", 26);
        addYellowLineFare("YL14", "YL18", 30);
        addYellowLineFare("YL14", "YL19", 35);
        addYellowLineFare("YL14", "YL20", 38);
        addYellowLineFare("YL14", "YL21", 41);
        addYellowLineFare("YL14", "YL22", 45);
        addYellowLineFare("YL14", "YL23", 45);

        addYellowLineFare("YL15", "YL15", 15);
        addYellowLineFare("YL15", "YL16", 21);
        addYellowLineFare("YL15", "YL17", 23);
        addYellowLineFare("YL15", "YL18", 27);
        addYellowLineFare("YL15", "YL19", 31);
        addYellowLineFare("YL15", "YL20", 35);
        addYellowLineFare("YL15", "YL21", 38);
        addYellowLineFare("YL15", "YL22", 42);
        addYellowLineFare("YL15", "YL23", 45);

        addYellowLineFare("YL16", "YL16", 15);
        addYellowLineFare("YL16", "YL17", 18);
        addYellowLineFare("YL16", "YL18", 23);
        addYellowLineFare("YL16", "YL19", 27);
        addYellowLineFare("YL16", "YL20", 30);
        addYellowLineFare("YL16", "YL21", 33);
        addYellowLineFare("YL16", "YL22", 38);
        addYellowLineFare("YL16", "YL23", 43);

        addYellowLineFare("YL17", "YL17", 15);
        addYellowLineFare("YL17", "YL18", 19);
        addYellowLineFare("YL17", "YL19", 24);
        addYellowLineFare("YL17", "YL20", 28);
        addYellowLineFare("YL17", "YL21", 30);
        addYellowLineFare("YL17", "YL22", 36);
        addYellowLineFare("YL17", "YL23", 40);

        addYellowLineFare("YL18", "YL18", 15);
        addYellowLineFare("YL18", "YL19", 19);
        addYellowLineFare("YL18", "YL20", 24);
        addYellowLineFare("YL18", "YL21", 27);
        addYellowLineFare("YL18", "YL22", 31);
        addYellowLineFare("YL18", "YL23", 36);

        addYellowLineFare("YL19", "YL19", 15);
        addYellowLineFare("YL19", "YL20", 19);
        addYellowLineFare("YL19", "YL21", 23);
        addYellowLineFare("YL19", "YL22", 27);
        addYellowLineFare("YL19", "YL23", 32);

        addYellowLineFare("YL20", "YL20", 15);
        addYellowLineFare("YL20", "YL21", 18);
        addYellowLineFare("YL20", "YL22", 24);
        addYellowLineFare("YL20", "YL23", 28);

        addYellowLineFare("YL21", "YL21", 15);
        addYellowLineFare("YL21", "YL22", 21);
        addYellowLineFare("YL21", "YL23", 25);

        addYellowLineFare("YL22", "YL22", 15);
        addYellowLineFare("YL22", "YL23", 21);

        addYellowLineFare("YL23", "YL23", 15);
    }

    private static void addYellowLineFare(String stationCode1, String stationCode2, int fare) {
        fares.computeIfAbsent(stationCode1.toLowerCase(), k -> new HashMap<>()).put(stationCode2.toLowerCase(), fare);
        fares.computeIfAbsent(stationCode2.toLowerCase(), k -> new HashMap<>()).put(stationCode1.toLowerCase(), fare);
    }
}
