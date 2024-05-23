package com.company.CommuteSystem.dto.Request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class EmployeeRegistRequest {
    private String name;
    private String teamName;
    private boolean ismanager;
    private LocalDate birthday;
    private LocalDate workStartDate;

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }

    @JsonProperty("is_manager")
    public boolean getismanager() {
        return ismanager;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getWorkStartDate() {
        return workStartDate;
    }
}
