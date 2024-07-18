package demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Connections {

    private Connections() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
    public static Map<String, List<String>> initializeConnections() {
        Map<String, List<String>> connections = new HashMap<>();
        for (Station station : AllStations.getAllStations()) {
            connections.put(station.getCode().toLowerCase(), new ArrayList<>());
        }

        addConnection(connections, "N24", "N23");
        addConnection(connections, "N23", "N22");
        addConnection(connections, "N22", "N21");
        addConnection(connections, "N21", "N20");
        addConnection(connections, "N20", "N19");
        addConnection(connections, "N19", "N18");
        addConnection(connections, "N18", "N17");
        addConnection(connections, "N17", "N16");
        addConnection(connections, "N16", "N15");
        addConnection(connections, "N15", "N14");
        addConnection(connections, "N14", "N13");
        addConnection(connections, "N13", "N12");
        addConnection(connections, "N12", "N11");
        addConnection(connections, "N11", "N10");
        addConnection(connections, "N10", "N9");
        addConnection(connections, "N9", "N8");
        addConnection(connections, "N8", "N7");
        addConnection(connections, "N7", "N6");
        addConnection(connections, "N6", "N5");
        addConnection(connections, "N5", "N4");
        addConnection(connections, "N4", "N3");
        addConnection(connections, "N3", "N2");
        addConnection(connections, "N2", "N1");
        addConnection(connections, "N1", "CEN");
        addConnection(connections, "CEN", "E1");
        addConnection(connections, "E1", "E2");
        addConnection(connections, "E2", "E3");
        addConnection(connections, "E3", "E4");
        addConnection(connections, "E4", "E5");
        addConnection(connections, "E5", "E6");
        addConnection(connections, "E6", "E7");
        addConnection(connections, "E7", "E8");
        addConnection(connections, "E8", "E9");
        addConnection(connections, "E9", "E10");
        addConnection(connections, "E10", "E11");
        addConnection(connections, "E11", "E12");
        addConnection(connections, "E12", "E13");
        addConnection(connections, "E13", "E14");
        addConnection(connections, "E14", "E15");
        addConnection(connections, "E15", "E16");
        addConnection(connections, "E16", "E17");
        addConnection(connections, "E17", "E18");
        addConnection(connections, "E18", "E19");
        addConnection(connections, "E19", "E20");
        addConnection(connections, "E20", "E21");
        addConnection(connections, "E21", "E22");
        addConnection(connections, "E22", "E23");

        // Dark Green Line
        addConnection(connections, "W1", "CEN");
        addConnection(connections, "CEN", "S1");
        addConnection(connections, "S1", "S2");
        addConnection(connections, "S2", "S3");
        addConnection(connections, "S3", "S4");
        addConnection(connections, "S4", "S5");
        addConnection(connections, "S5", "S6");
        addConnection(connections, "S6", "S7");
        addConnection(connections, "S7", "S8");
        addConnection(connections, "S8", "S9");
        addConnection(connections, "S9", "S10");
        addConnection(connections, "S10", "S11");
        addConnection(connections, "S11", "S12");

        // Gold Line
        addConnection(connections, "S7", "G1");
        addConnection(connections, "G1", "G2");
        addConnection(connections, "G2", "G3");

        // Yellow Line
        addConnection(connections, "YL01", "YL02");
        addConnection(connections, "YL02", "YL03");
        addConnection(connections, "YL03", "YL04");
        addConnection(connections, "YL04", "YL05");
        addConnection(connections, "YL05", "YL06");
        addConnection(connections, "YL06", "YL07");
        addConnection(connections, "YL07", "YL08");
        addConnection(connections, "YL08", "YL09");
        addConnection(connections, "YL09", "YL10");
        addConnection(connections, "YL10", "YL11");
        addConnection(connections, "YL11", "YL12");
        addConnection(connections, "YL12", "YL13");
        addConnection(connections, "YL13", "YL14");
        addConnection(connections, "YL14", "YL15");
        addConnection(connections, "YL15", "YL16");
        addConnection(connections, "YL16", "YL17");
        addConnection(connections, "YL17", "YL18");
        addConnection(connections, "YL18", "YL19");
        addConnection(connections, "YL19", "YL20");
        addConnection(connections, "YL20", "YL21");
        addConnection(connections, "YL21", "YL22");
        addConnection(connections, "YL22", "YL23");

        // Pink Line
        addConnection(connections, "PK01", "PK02");
        addConnection(connections, "PK02", "PK03");
        addConnection(connections, "PK03", "PK04");
        addConnection(connections, "PK04", "PK05");
        addConnection(connections, "PK05", "PK06");
        addConnection(connections, "PK06", "PK07");
        addConnection(connections, "PK07", "PK08");
        addConnection(connections, "PK08", "PK09");
        addConnection(connections, "PK09", "PK10");
        addConnection(connections, "PK10", "PK11");
        addConnection(connections, "PK11", "PK12");
        addConnection(connections, "PK12", "PK13");
        addConnection(connections, "PK13", "PK14");
        addConnection(connections, "PK14", "PK15");
        addConnection(connections, "PK15", "PK16");
        addConnection(connections, "PK16", "PK17");
        addConnection(connections, "PK17", "PK18");
        addConnection(connections, "PK18", "PK19");
        addConnection(connections, "PK19", "PK20");
        addConnection(connections, "PK20", "PK21");
        addConnection(connections, "PK21", "PK23");
        addConnection(connections, "PK23", "PK24");
        addConnection(connections, "PK24", "PK25");
        addConnection(connections, "PK25", "PK26");
        addConnection(connections, "PK26", "PK27");
        addConnection(connections, "PK27", "PK28");
        addConnection(connections, "PK28", "PK29");
        addConnection(connections, "PK29", "PK30");

        addConnection(connections, "BL01", "BL02");
        addConnection(connections, "BL02", "BL03");
        addConnection(connections, "BL03", "BL04");
        addConnection(connections, "BL04", "BL05");
        addConnection(connections, "BL05", "BL06");
        addConnection(connections, "BL06", "BL07");
        addConnection(connections, "BL07", "BL08");
        addConnection(connections, "BL08", "BL09");
        addConnection(connections, "BL09", "BL10");
        addConnection(connections, "BL10", "BL11");
        addConnection(connections, "BL11", "BL12");
        addConnection(connections, "BL12", "BL13");
        addConnection(connections, "BL13", "BL14");
        addConnection(connections, "BL14", "BL15");
        addConnection(connections, "BL15", "BL16");
        addConnection(connections, "BL16", "BL17");
        addConnection(connections, "BL17", "BL18");
        addConnection(connections, "BL18", "BL19");
        addConnection(connections, "BL19", "BL20");
        addConnection(connections, "BL20", "BL21");
        addConnection(connections, "BL21", "BL22");
        addConnection(connections, "BL22", "BL23");
        addConnection(connections, "BL23", "BL24");
        addConnection(connections, "BL24", "BL25");
        addConnection(connections, "BL25", "BL26");
        addConnection(connections, "BL26", "BL27");
        addConnection(connections, "BL27", "BL28");
        addConnection(connections, "BL28", "BL29");
        addConnection(connections, "BL29", "BL30");
        addConnection(connections, "BL30", "BL31");
        addConnection(connections, "BL31", "BL32");
        addConnection(connections, "BL32", "BL33");
        addConnection(connections, "BL33", "BL34");
        addConnection(connections, "BL34", "BL35");
        addConnection(connections, "BL35", "BL36");
        addConnection(connections, "BL36", "BL37");
        addConnection(connections, "BL37", "BL38");

        // Purple Line
        addConnection(connections, "pp01", "pp02");
        addConnection(connections, "pp02", "pp03");
        addConnection(connections, "pp03", "pp04");
        addConnection(connections, "pp04", "pp05");
        addConnection(connections, "pp05", "pp06");
        addConnection(connections, "pp06", "pp07");
        addConnection(connections, "pp07", "pp08");
        addConnection(connections, "pp08", "pp09");
        addConnection(connections, "pp09", "pp10");
        addConnection(connections, "pp10", "pp11");
        addConnection(connections, "pp11", "pp12");
        addConnection(connections, "pp12", "pp13");
        addConnection(connections, "pp13", "pp14");
        addConnection(connections, "pp14", "pp15");
        addConnection(connections, "pp15", "pp16");

        //ARL
        addConnection(connections, "A8", "A7");
        addConnection(connections, "A7", "A6");
        addConnection(connections, "A6", "A5");
        addConnection(connections, "A5", "A4");
        addConnection(connections, "A4", "A3");
        addConnection(connections, "A3", "A2");
        addConnection(connections, "A2", "A1");

        addSpecialConnections(connections);

        return connections;
    }

    private static void addConnection(Map<String, List<String>> connections, String stationCode1, String stationCode2) {
        connections.get(stationCode1.toLowerCase()).add(stationCode2.toLowerCase());
        connections.get(stationCode2.toLowerCase()).add(stationCode1.toLowerCase());
    }

    private static void addSpecialConnections(Map<String, List<String>> connections) {
        addConnection(connections, "N17", "PK16");
        addConnection(connections, "E15", "YL23");
        addConnection(connections, "N8", "BL13");
        addConnection(connections, "N9", "BL14");
        addConnection(connections, "CEN", "W1");
        addConnection(connections, "CEN", "E1");
        addConnection(connections, "CEN", "S1");
        addConnection(connections, "S6", "S7");
        addConnection(connections, "BL13", "N8");
        addConnection(connections, "BL15", "YL01");
        addConnection(connections, "BL22", "E4");
        addConnection(connections, "BL26", "S2");
        addConnection(connections, "BL34", "S12");
        addConnection(connections, "BL01", "BL33");
        addConnection(connections, "BL01", "BL32");
        addConnection(connections, "N2", "A1");
        addConnection(connections, "BL21", "A3");
        addConnection(connections, "BL10", "PP16");
    }
}
