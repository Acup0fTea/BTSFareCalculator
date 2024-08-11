package com.bts.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bts.training.entity.StationConnection;

public interface StationConnectionRepository extends JpaRepository<StationConnection, Long> {
}
