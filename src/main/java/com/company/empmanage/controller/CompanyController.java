package com.company.empmanage.controller;

import com.company.empmanage.dto.MemberRegistRequest;
import com.company.empmanage.dto.MemberResponse;
import com.company.empmanage.dto.TeamRegistRequest;
import com.company.empmanage.dto.TeamResponse;
import com.company.empmanage.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CompanyController {

    private CompanyService companyService;

    @PostMapping("/team")
    public void saveTeam(@RequestBody TeamRegistRequest request) {
        companyService.saveTeam(request);
    }

    @PostMapping("/member")
    public void saveMember(@RequestBody MemberRegistRequest request) {
        companyService.saveMember(request);
    }

    @GetMapping("/team")
    public List<TeamResponse> getTeam(){
        return companyService.getTeam();
    }

    @GetMapping("/member")
    public List<MemberResponse> getMember(){
        return companyService.getMember();
    }
}
