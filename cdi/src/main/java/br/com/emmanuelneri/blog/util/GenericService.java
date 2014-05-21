package br.com.emmanuelneri.blog.util;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public abstract class GenericService {

    @Inject
    private EntityManager entityManager;

    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
