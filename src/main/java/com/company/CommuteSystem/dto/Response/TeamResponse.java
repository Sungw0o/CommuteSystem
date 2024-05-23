package com.company.CommuteSystem.dto.Response;

import com.company.CommuteSystem.domain.Team;

public class TeamResponse {

    private String name;
    private String manager;

    private int EmployeeCount;

    public TeamResponse(Team team) {
        this.name = team.getName();
        this.manager = team.getManager();
        this.EmployeeCount = team.getNumberOfEmployee();
    }
}
