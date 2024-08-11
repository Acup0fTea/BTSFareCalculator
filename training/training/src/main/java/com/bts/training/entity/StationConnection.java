package com.bts.training.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class StationConnection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "station_code1", referencedColumnName = "code", nullable = false)
    private Station stationCode1;

    @ManyToOne
    @JoinColumn(name = "station_code2", referencedColumnName = "code", nullable = false)
    private Station stationCode2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Station getStationCode1() {
        return stationCode1;
    }

    public void setStationCode1(Station stationCode1) {
        this.stationCode1 = stationCode1;
    }

    public Station getStationCode2() {
        return stationCode2;
    }

    public void setStationCode2(Station stationCode2) {
        this.stationCode2 = stationCode2;
    }

    

}
