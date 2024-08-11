package com.bts.training.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bts.training.entity.Station;
import com.bts.training.model.RouteInfo;
import com.bts.training.service.BTSFareCalculatorService;

@RestController
@RequestMapping("/api/bts")
public class BTSFareCalculatorController {

    @Autowired
    private BTSFareCalculatorService btsFareCalculatorService;

    @GetMapping("/stations")
    public ResponseEntity<List<Station>> getAllStations() {
        List<Station> stations = btsFareCalculatorService.getAllStations();
        return ResponseEntity.ok(stations);
    }

    @GetMapping("/calculate-fare")
    public ResponseEntity<RouteInfo> calculateFare(
            @RequestParam String startStation,
            @RequestParam String endStation) {
        try {
            RouteInfo routeInfo = btsFareCalculatorService.calculateFare(startStation, endStation);
            if (routeInfo != null) {
                return ResponseEntity.ok(routeInfo);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
