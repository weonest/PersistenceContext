package com.example.persis.domain.lazy;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.Test;

class EmfTest {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
    EntityManager entityManager = emf.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();

    @Test
    void applicationManagedEntityManagerTest() {
        try {
            transaction.begin();
            // 비지니스 로직..
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
        entityManager.close();
        emf.close();
    }
}
