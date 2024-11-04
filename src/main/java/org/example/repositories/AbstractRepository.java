package org.example.repositories;

import org.example.configs.EntityManagerPostgres;
import jakarta.persistence.EntityManager;
import java.util.List;

public abstract class AbstractRepository<T> {
    private final EntityManagerPostgres<T> entityManagerPostgres;

    protected AbstractRepository(EntityManagerPostgres<T> entityManagerPostgres) {
        this.entityManagerPostgres = entityManagerPostgres;
    }

    public void save(T entity) {
        EntityManager em = entityManagerPostgres.getEntityManager();
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        em.close();
    }

    public T find(Long id, Class<T> clazz) {
        EntityManager em = entityManagerPostgres.getEntityManager();
        T entity = em.find(clazz, id);
        em.close();
        return entity;
    }

    public List<T> findAll(String query, Class<T> clazz) {
        EntityManager em = entityManagerPostgres.getEntityManager();
        List<T> entities = em.createQuery(query, clazz).getResultList();
        em.close();
        return entities;
    }
}
