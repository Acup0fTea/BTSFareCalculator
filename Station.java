package demo;
public class Station {
    private final String name;
    private final String type;
    private final String code;
    private final String line;
    private final String productOwner;

    public Station(String name, String type, String code, String line, String productOwner) {
        this.name = name;
        this.type = type;
        this.code = code;
        this.line = line;
        this.productOwner = productOwner;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getLine() {
        return line;
    }

    public String getProductOwner() {
        return productOwner;
    }

    public String getCode() {
        return code;
    }
}
