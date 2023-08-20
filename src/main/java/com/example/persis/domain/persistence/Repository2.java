package com.example.persis.domain.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class Repository2 {
    @PersistenceContext
    EntityManager em2;

    public void test() {
        System.out.println("repository2 엔티티 매니저 클래스 = " + em2.getClass());
        System.out.println("repository2 엔티티 매니저 프록시 해시코드 = " + System.identityHashCode(em2)); // 프록시의 주소
        System.out.println("repository2 실제 엔티티 매니저 = " + em2.getDelegate()); // 실제 엔티티매니저 객체의 주소 (== 영속성 컨텍스트)
    }
}
