package com.company.CommuteSystem.domain;

import jakarta.persistence.*;
import com.company.CommuteSystem.domain.Employee;
import java.util.List;

@Entity

public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    private String manager;

    protected Team() {}

    public Team(String name,String manager) {
        this.name = name;
        this.manager = manager;
    }
    public String getManager(){
        Employee manager = employee.stream()
                .filter(employee -> employee.is_manager()).findFirst().orElse(null);
        return manager == null ?  null : manager.getName();
    }
    public String getName() {
        return name;
    }

    @OneToMany(mappedBy = "team")
    private List<Employee> employee;

    public int getNumberOfEmployee(){
        return employee.size();
    }
}
