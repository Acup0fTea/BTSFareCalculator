package com.bts.training.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bts.training.entity.YellowLineFare;

public interface YellowLineFareRepository extends JpaRepository<YellowLineFare, String> {
    Optional<YellowLineFare> findByStartStationAndEndStation(String startStation, String endStation);
}
