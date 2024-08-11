package com.bts.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bts.training.entity.PinkLineFare;
import com.bts.training.repository.PinkLineFareRepository;

@Service
public class PinkLineFares {

    @Autowired
    private PinkLineFareRepository pinkLineFareRepository;

    public int getFare(String start, String end) {
        return pinkLineFareRepository.findByStartStationAndEndStation(start, end)
                .map(PinkLineFare::getFare)
                .orElseThrow(() -> new IllegalArgumentException("Fare not found for given stations"));
    }
}
