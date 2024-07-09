package com.company.empmanage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class MemberRegistRequest {
    private String name;
    private String teamName;
    @JsonProperty("managerORmember")
    private boolean managerORmember;

    private LocalDate birthday;
    private LocalDate workStartDate;

}

