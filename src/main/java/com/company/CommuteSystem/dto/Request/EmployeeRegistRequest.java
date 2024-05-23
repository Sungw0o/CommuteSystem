package com.company.CommuteSystem.dto.Request;

import com.company.CommuteSystem.domain.Employee;

import java.time.LocalDate;

public class EmployeeRegistRequest {
    private String name;
    private String TeamName;
    private Employee.Role role;
    private LocalDate birthday;
    private LocalDate workStartDate;

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return TeamName;
    }

    public Employee.Role getRole() {
        return role;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getWorkStartDate() {
        return workStartDate;
    }
}
