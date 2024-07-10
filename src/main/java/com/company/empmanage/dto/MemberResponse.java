package com.company.empmanage.dto;

import com.company.empmanage.entity.Member;
import com.company.empmanage.entity.Role;
import com.company.empmanage.entity.Team;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class MemberResponse {
    private String name;
    private String teamName;
    private Role role;
    private LocalDate birthday;
    private LocalDate workStartDate;

    public MemberResponse(Member member) {
        this.name = member.getName();
        this.teamName = member.getTeam().getName();
        this.role = member.getRole();
        this.birthday = member.getBirthday();
        this.workStartDate = member.getWorkStartDate();
    }

    public MemberResponse(Team team) {
    }
}
