package org.example.configs;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerPostgres<T> {
    private static final EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("myPU");

    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
}
