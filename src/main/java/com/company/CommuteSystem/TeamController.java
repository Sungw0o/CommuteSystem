package com.company.CommuteSystem;

import com.company.CommuteSystem.Request.TeamRegistRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.company.CommuteSystem.Service.TeamService;

@RestController
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping("/team/save")
    public void saveTeam(@RequestBody TeamRegistRequest request){
        teamService.saveTeam(request);
    }
}
