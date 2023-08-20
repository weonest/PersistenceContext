package com.example.persis.domain.osiv;

import com.example.persis.domain.lazy.Member;
import com.example.persis.domain.lazy.MemberService;
import com.example.persis.domain.lazy.Team;
import com.example.persis.domain.lazy.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class OsivController {

    private final MemberService memberService;
    private final TeamService teamService;

    @GetMapping
    public void test() {
        Member member = memberService.create();
        System.out.println("멤버 이름 = " + member.getName());
        System.out.println("멤버의 팀 이름 = " + member.getTeam().getName());

        member.setName("범준");
        teamService.findAll();
    }

    @GetMapping("/all")
    public void test2() {
        List<Member> all = memberService.findAll();
        Member member = all.get(0);
        System.out.println("멤버 이름 = " + member.getName());
        System.out.println("팀 ID 조회 = " + member.getTeam().getId());
        System.out.println("팀 이름 조회 = " + member.getTeam().getName());
    }
    
}
