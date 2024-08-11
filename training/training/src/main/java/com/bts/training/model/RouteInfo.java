package com.bts.training.model;

import com.bts.training.entity.Station;

import java.util.List;

public class RouteInfo {
    private List<Station> route;
    private int fare;
    private int time;

    public RouteInfo(List<Station> route, int fare, int time) {
        this.route = route;
        this.fare = fare;
        this.time = time;
    }

    // Getters and setters

    public List<Station> getRoute() {
        return route;
    }

    public void setRoute(List<Station> route) {
        this.route = route;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
