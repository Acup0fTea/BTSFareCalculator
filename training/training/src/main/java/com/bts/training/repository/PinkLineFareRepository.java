package com.bts.training.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bts.training.entity.PinkLineFare;

public interface PinkLineFareRepository extends JpaRepository<PinkLineFare, String> {
    Optional<PinkLineFare> findByStartStationAndEndStation(String startStation, String endStation);
}
