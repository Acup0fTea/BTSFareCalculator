package com.bts.training.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String line;

    


    public Station() {}

    public Station(String name, String type, String code, String line) {
        this.name = name;
        this.type = type;
        this.code = code;
        this.line = line;
    }

    // Getter methods

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCode() {
        return code;
    }

    public String getLine() {
        return line;
    }

    // public List<StationConnection> getConnections() {
    //     return connections;
    // }
}
