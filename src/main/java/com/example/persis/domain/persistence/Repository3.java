package com.example.persis.domain.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceContextType;
import org.springframework.stereotype.Repository;

@Repository
public class Repository3 {
    @PersistenceContext(type = PersistenceContextType.EXTENDED)
    EntityManager em3;

    public void test() {
        System.out.println("repository3 엔티티 매니저 클래스 = " + em3.getClass());
        System.out.println("repository3 엔티티 매니저 프록시 해시코드 = " + System.identityHashCode(em3));
        System.out.println("repository3 실제 엔티티 매니저 = " + em3.getDelegate());
    }
}
