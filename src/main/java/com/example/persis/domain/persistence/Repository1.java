package com.example.persis.domain.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class Repository1 {
    @PersistenceContext
    EntityManager em1;

    public void test() {
        System.out.println("repository1 엔티티 매니저 클래스 = " + em1.getClass());
        System.out.println("repository1 엔티티 매니저 프록시 해시코드 = " + System.identityHashCode(em1));
        System.out.println("repository1 실제 엔티티 매니저 = " + em1.getDelegate());
    }
}
