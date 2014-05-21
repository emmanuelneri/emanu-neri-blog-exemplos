package br.com.emmanuelneri.blog.util;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

public final class EntityManagerProducer {

    @PersistenceUnit(unitName = "cdiPU")
    private EntityManagerFactory entityManagerFactory;

    @Produces
    public EntityManager createEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

}
