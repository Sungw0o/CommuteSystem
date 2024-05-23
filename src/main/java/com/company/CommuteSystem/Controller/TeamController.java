package com.company.CommuteSystem.Controller;

import com.company.CommuteSystem.Service.TeamService;
import com.company.CommuteSystem.dto.Request.TeamRegistRequest;
import com.company.CommuteSystem.dto.Response.TeamResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping("/regist")
    public void RegistTeam(@RequestBody TeamRegistRequest request){
        teamService.RegistTeam(request);
    }

    @GetMapping("/show")
    public List<TeamResponse> ShowTeams(){
        return teamService.ShowTeams();
    }
}