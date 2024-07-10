package com.company.empmanage.service;

import com.company.empmanage.dto.TeamResponse;
import com.company.empmanage.entity.Team;
import com.company.empmanage.repository.TeamRepository;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class TeamService {

    private final TeamRepository teamRepository;

    @Transactional
    public void RegistTeam(String name) {
        boolean isDuplicate = teamRepository.existsByName(name);
        if(name == null || name.isBlank()) throw new IllegalArgumentException("팀 이름은 빈 값을 저장할 수 없습니다.");
        if(isDuplicate) throw new IllegalArgumentException("팀 이름이 중복되었습니다.");
        teamRepository.save(Team.builder().name(name).build());
    }

    @Transactional(readOnly = true)
    public List<TeamResponse> getTeamList() {
        return teamRepository.findAll().stream()
                .map(TeamResponse::new)
                .collect(Collectors.toList());
    }



}
