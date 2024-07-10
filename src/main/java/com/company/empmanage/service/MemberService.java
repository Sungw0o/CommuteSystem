package com.company.empmanage.service;

import com.company.empmanage.dto.MemberRequest;
import com.company.empmanage.dto.MemberResponse;
import com.company.empmanage.entity.Member;
import com.company.empmanage.entity.Role;
import com.company.empmanage.entity.Team;
import com.company.empmanage.repository.MemberRepository;
import com.company.empmanage.repository.TeamRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;
    private final TeamRepository teamRepository;

    @Transactional
    public String RegisterMember(MemberRequest request) {
        Team team = teamRepository.findById(request.getTeamName())
                .orElseThrow(IllegalArgumentException::new);

        memberRepository.save(Member.builder()
                .name(request.getName())
                .team(team)
                .role(request.getRole())
                .workStartDate(request.getWorkStartDate())
                .birthday(request.getBirthday()).build());

        if(request.getRole()== Role.Manager){
            team.setManager(request.getName());
        }
        team.addMember();

        return request.getName() + " 님 " + request.getTeamName() + " 에 등록 완료되었습니다.";
    }

    public List<MemberResponse> getMemberList() {
        return memberRepository.findAll().stream()
                .map(MemberResponse::new)
                .collect(Collectors.toList());
    }
}
