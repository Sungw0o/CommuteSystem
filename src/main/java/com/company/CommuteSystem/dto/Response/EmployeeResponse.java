package com.company.CommuteSystem.dto.Response;

import java.time.LocalDate;

public class EmployeeResponse {
    private String name;
    private String teamName;
    private boolean is_manager;
    private LocalDate birthday;
    private LocalDate workStart;

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean isIs_manager() {
        return is_manager;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getWorkStart() {
        return workStart;
    }

    public EmployeeResponse(String name, String teamName, boolean is_manager, LocalDate birthday, LocalDate workStart) {
        this.name = name;
        this.teamName = teamName;
        this.is_manager = is_manager;
        this.birthday = birthday;
        this.workStart = workStart;
    }
}
