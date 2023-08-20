package com.example.persis.domain.lazy;

import com.example.persis.domain.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private TeamRepository teamRepository;

    @PersistenceContext
    private EntityManager em;

    @Test
    void test() {
        Member member = new Member("user");
        Team team = new Team("A");
        em.persist(team);

        member.setTeam(team);
        em.persist(member);
        em.flush();
        em.clear();

        Member am = em.find(Member.class, 1L);
        System.out.println("team id = " + am.getTeam().getId());

        System.out.println("team name = " + am.getTeam().getName());
    }

    @Test
    void test2() {
        Team team = new Team("승훈팀");
        Team saved = teamRepository.save(team);
        Long id = saved.getId();
        String name = saved.getName();
        teamRepository.deleteById(id);
    }
}