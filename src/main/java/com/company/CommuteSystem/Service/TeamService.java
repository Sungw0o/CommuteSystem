package com.company.CommuteSystem.Service;

import com.company.CommuteSystem.Repository.TeamRepository;
import com.company.CommuteSystem.Request.TeamRegistRequest;
import com.company.CommuteSystem.domain.Team;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Transactional
    public void saveTeam(TeamRegistRequest request){
        teamRepository.save(new Team(request.getName()));
    }
}
