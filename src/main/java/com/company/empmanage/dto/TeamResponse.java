package com.company.empmanage.dto;

import com.company.empmanage.entity.Team;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TeamResponse {
    private String name;
    private String manager;
    private int memberCount;

    public TeamResponse(Team team) {
        this.name = team.getName();
        this.manager = team.getManager();
        this.memberCount = team.getMemberCount();
    }
}
