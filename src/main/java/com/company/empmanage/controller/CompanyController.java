package com.company.empmanage.controller;

import com.company.empmanage.dto.MemberRequest;
import com.company.empmanage.dto.MemberResponse;
import com.company.empmanage.dto.TeamResponse;
import com.company.empmanage.entity.Member;
import com.company.empmanage.entity.Team;
import com.company.empmanage.service.MemberService;
import com.company.empmanage.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CompanyController {

    private TeamService teamService;
    private MemberService memberService;


    @PostMapping("/team")
    public void addTeam(@RequestParam String name) {
        teamService.RegistTeam(name);
    }

    @GetMapping("/team")
    public List<TeamResponse> getTeams() {
        return teamService.getTeamList();
    }


    @PostMapping("/member")
    public String RegisterMember(@RequestBody MemberRequest request) {
        return memberService.RegisterMember(request);
    }

    @GetMapping("/member")
    public List<MemberResponse> getMembers() {
        return memberService.getMemberList();
    }

}


