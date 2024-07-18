package demo;
import java.util.List;
import java.time.LocalTime;
public class RouteInfo {
    List<Station> route;
    int fare;
    int time;
    LocalTime reachTime;

    public RouteInfo(List<Station> route, int fare, int time, LocalTime reachTime) {
        this.route = route;
        this.fare = fare;
        this.time = time;
        this.reachTime = reachTime;
    }
}