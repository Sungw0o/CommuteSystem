package com.company.empmanage.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamRequest {
    private String name;
    private String managerName;
    private int memberCount;
}
