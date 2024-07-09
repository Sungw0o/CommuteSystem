package com.company.empmanage.dto;

import com.company.empmanage.entity.Member;
import com.company.empmanage.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Getter
public class MemberResponse {
    private String name;
    private String teamname;
    private Role role;
    private LocalDate birthday;
    private LocalDate workStartday;

    public MemberResponse(Member member) {
        this.name = member.getName();
        this.teamname = member.getTeamName();
        this.role = member.getRole();
        this.birthday = member.getBirthday();
        this.workStartday =member.getWorkStartDate();
    }
}
