package com.bts.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bts.training.entity.YellowLineFare;
import com.bts.training.repository.YellowLineFareRepository;

@Service
public class YellowLineFares {

    @Autowired
    private YellowLineFareRepository yellowLineFareRepository;

    public int getFare(String start, String end) {
        return yellowLineFareRepository.findByStartStationAndEndStation(start, end)
                .map(YellowLineFare::getFare)
                .orElseThrow(() -> new IllegalArgumentException("Fare not found for given stations"));
    }
}
