package com.company.CommuteSystem.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "team")
    private List<Employee> employeeList;

    protected Team() {}

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
