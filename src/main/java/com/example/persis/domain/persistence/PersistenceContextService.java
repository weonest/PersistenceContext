package com.example.persis.domain.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PersistenceContextService {

    private final Repository1 repository1;
    private final Repository2 repository2;
    private final Repository3 repository3;
    private final Repository4 repository4;

    @PersistenceContext // 또는 @Autowired
    EntityManager em;

    @Transactional
    public void withTransaction() {
        System.out.println("기본 타입 시작");
        repository1.test();
        System.out.println();
        repository2.test();
        System.out.println("기본 타입 종료");
        System.out.println();
        System.out.println("EXTENDED 타입 시작");
        repository3.test();
        System.out.println();
        repository4.test();
        System.out.println("EXTENDED 타입 종료");
    }

    public void withoutTransaction() {
        System.out.println("기본 타입 시작");
        repository1.test();
        System.out.println();
        repository2.test();
        System.out.println("기본 타입 종료");
        System.out.println();
        System.out.println("EXTENDED 타입 시작");
        repository3.test();
        System.out.println();
        repository4.test();
        System.out.println("EXTENDED 타입 종료");
    }

    @Transactional
    public void withTransaction2() {
        System.out.println("기본 타입 시작");
        repository1.test();
        System.out.println();
        repository2.test();
        System.out.println("기본 타입 종료");
        System.out.println();
        System.out.println("EXTENDED 타입 시작");
        repository3.test();
        System.out.println();
        repository4.test();
        System.out.println("EXTENDED 타입 종료");
    }
}
