package com.bts.training.service;

import java.util.List;

import com.bts.training.entity.Station;
import org.springframework.stereotype.Service;

@Service
public class CalculateTime {

    public int calculateTime(List<Station> route) {
        if (route == null || route.isEmpty()) {
            return 0;
        }

        return (int) Math.round(1.8 * route.size());
    }
}
