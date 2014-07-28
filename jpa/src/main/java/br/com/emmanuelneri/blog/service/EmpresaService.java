package br.com.emmanuelneri.blog.service;

import br.com.emmanuelneri.blog.Empresa;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

@Stateless
@Local
public class EmpresaService {

    @PersistenceUnit
    private EntityManager entityManager;

    public Empresa findByCnpj(String cnpj) {
        return entityManager.createNamedQuery(
                "Empresa.findByCnpj", Empresa.class)
                .setParameter("cnpj", cnpj).getSingleResult();
    }

}
