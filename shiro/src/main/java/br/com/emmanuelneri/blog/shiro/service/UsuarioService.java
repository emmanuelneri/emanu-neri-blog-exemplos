package br.com.emmanuelneri.blog.shiro.service;

import br.com.emmanuelneri.blog.shiro.model.Usuario;
import com.google.common.collect.Iterables;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
public class UsuarioService {

    @PersistenceContext
    private EntityManager entityManager;

    public Usuario findByLogin(String login) {
        return Iterables.getFirst(entityManager.createNamedQuery("Usuario.findByLogin", Usuario.class)
                .setParameter("login" , login)
                .getResultList(), null);
    }


}
