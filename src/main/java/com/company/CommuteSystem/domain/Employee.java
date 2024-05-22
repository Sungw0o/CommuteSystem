package com.company.CommuteSystem.domain;

import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="employeeInfo")

public class Employee {
    public enum Role{
        manager, member
    }

    protected Employee() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="team_id")
    private Team team;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private Role role;

    private LocalDate birthday;

    private LocalDate workStartDate;

    public Employee(Team team, String name, Role role, LocalDate birthday, LocalDate workStartDate) {
        this.team = team;
        this.name = name;
        this.role = role;
        this.birthday = birthday;
        this.workStartDate = workStartDate;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getWorkStartDate() {
        return workStartDate;
    }
}
