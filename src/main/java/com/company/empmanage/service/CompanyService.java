package com.company.empmanage.service;

import com.company.empmanage.dto.MemberRegistRequest;
import com.company.empmanage.dto.MemberResponse;
import com.company.empmanage.dto.TeamRegistRequest;
import com.company.empmanage.dto.TeamResponse;
import com.company.empmanage.entity.Member;
import com.company.empmanage.entity.Team;
import com.company.empmanage.entity.Role;
import com.company.empmanage.repository.MemberRepository;
import com.company.empmanage.repository.TeamRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@AllArgsConstructor
@Service
public class CompanyService {

    private final TeamRepository teamRepository;
    private final MemberRepository memberRepository;

    @Transactional
    public void saveTeam(TeamRegistRequest request){
        teamRepository.save(new Team(request.getName()));
    }

    @Transactional
    public void saveMember(MemberRegistRequest request){
        Team team = teamRepository.findByName(request.getName()) // 팀 이름으로 팀 정보를 조회
                .orElseThrow(IllegalArgumentException::new);
        Role role = request.isManagerORmember() ? Role.Manager : Role.Member;
        // 메서드의 결과에 따라 역할을 결정
        memberRepository.save(new Member(request.getName(), request.getTeamName(), role,
                request.getBirthday(), request.getWorkStartDate()));


        if(role.equals(Role.Manager)) {
            team.setTeamManager(request.getName());
            teamRepository.save(team);
        }
        teamRepository.save(team);
    }

    public List<TeamResponse> getTeam() {
        List<Team> teams = teamRepository.findAll();
        return teams.stream()
                .map(TeamResponse::new)
                .collect(Collectors.toList());
    }

    public List<MemberResponse> getMember() {
        List<Member> members = memberRepository.findAll();
        return members.stream()
                .map(MemberResponse::new)
                .collect(Collectors.toList());
    }


}
