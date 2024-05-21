package com.company.CommuteSystem.domain;

import jakarta.persistence.*;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    protected Team() {}

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
