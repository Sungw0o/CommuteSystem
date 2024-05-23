package com.company.CommuteSystem.domain;

import com.company.CommuteSystem.domain.Team;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="team_id")
    private Team team;

    private String name;
    private boolean is_manager;
    private LocalDate birthday;
    private LocalDate workStartDate;


    public Team getTeam() {
        return team;
    }

    public String getName() {
        return name;
    }

    @Column(name = "is_manager")
    public boolean is_manager() {
        return is_manager;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getWorkStartDate() {
        return workStartDate;
    }

    protected Employee() {}

    public Employee(Team team, String name, boolean is_manager, LocalDate birthday, LocalDate workStartDate) {
        this.team = team;
        this.name = name;
        this.is_manager = is_manager;
        this.birthday = birthday;
        this.workStartDate = workStartDate;
    }

}