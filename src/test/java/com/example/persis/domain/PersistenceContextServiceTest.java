package com.example.persis.domain;

import com.example.persis.domain.persistence.PersistenceContextService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//@AutoConfigureTestDatabase
class PersistenceContextServiceTest {

    @Autowired
    private PersistenceContextService service;

    @Test
    void persistenceContextTest() {
        System.out.println("==== 트랜잭션 O ====");
        service.withTransaction();
        System.out.println("==== 트랜잭션 X ====");
        service.withoutTransaction();
        System.out.println("==== 트랜잭션 O ====");
        service.withTransaction2();
    }
}

