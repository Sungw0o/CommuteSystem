package com.company.empmanage.dto;

import com.company.empmanage.entity.Team;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class TeamResponse {
    private String name;
    private String manager;

    public TeamResponse(Team team) {
        this.name = name;
        this.manager = manager;
    }
}
