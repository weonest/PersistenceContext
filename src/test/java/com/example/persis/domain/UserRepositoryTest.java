package com.example.persis.domain;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryTest {

    @PersistenceContext
    EntityManager em;

    @Autowired
    UserRepository userRepository;

    @Test
    void test() {
        User user = new User("1");
        User user2 = new User("2");
        user2.setId(null);
        em.persist(user);
        System.out.println("1 = " + 1);
        User merge = em.merge(user2);
        User user1 = em.find(User.class, 1L);

        System.out.println("참이냐 혹은 거짓이냐 ");
        System.out.println(merge == user1);
        System.out.println("merge = " + merge);

        System.out.println(userRepository.findAll());
    }

    @Test
    void test2() {
        User user = em.find(User.class, 1L);
        System.out.println("user = " + user);
    }
}