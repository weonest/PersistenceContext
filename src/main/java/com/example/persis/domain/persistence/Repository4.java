package com.example.persis.domain.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceContextType;
import org.springframework.stereotype.Repository;

@Repository
public class Repository4 {
    @PersistenceContext(type = PersistenceContextType.EXTENDED)
    EntityManager em4;

    public void test() {
        System.out.println("repository4 엔티티 매니저 클래스 = " + em4.getClass());
        System.out.println("repository4 엔티티 매니저 프록시 해시코드 = " + System.identityHashCode(em4)); // 프록시의 주소
        System.out.println("repository4 실제 엔티티 매니저 = " + em4.getDelegate()); // 실제 엔티티매니저 객체의 주소 (== 영속성 컨텍스트)
    }
}
