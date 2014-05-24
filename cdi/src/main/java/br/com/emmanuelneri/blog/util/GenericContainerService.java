package br.com.emmanuelneri.blog.util;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class GenericContainerService {

    @PersistenceContext
    private EntityManager entityManager;

    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
