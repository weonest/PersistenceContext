package com.example.persis.domain.lazy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final TeamRepository teamRepository;

    public Member create() {
        Member member = new Member("건희");
        Team team = new Team("승훈팀");
        Team savedTeam = teamRepository.save(team);
        member.setTeam(savedTeam);
        return memberRepository.save(member);
    }

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

}
