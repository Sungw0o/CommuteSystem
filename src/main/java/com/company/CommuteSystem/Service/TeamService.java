package com.company.CommuteSystem.Service;

import com.company.CommuteSystem.domain.Team;
import com.company.CommuteSystem.Repository.TeamRepository;
import com.company.CommuteSystem.dto.Request.TeamRegistRequest;
import com.company.CommuteSystem.dto.Response.TeamResponse;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Transactional
    public void RegistTeam(TeamRegistRequest request){
        teamRepository.save(new Team(request.getName(),request.getManager()));
    }

    @Transactional
    public List<TeamResponse> ShowTeams() {
        List<Team> teams = teamRepository.findAll();
        List<TeamResponse> teamResponseList = teams.stream().map(team -> new TeamResponse(team)).collect(Collectors.toList());

        return teamResponseList;
    }
}