package br.com.emmanuelneri.blog.service;

import br.com.emmanuelneri.blog.model.Pessoa;
import br.com.emmanuelneri.blog.util.GenericService;

import javax.inject.Named;

@Named
public class PessoaService extends GenericService {

    public void salvar(Pessoa pessoa) {
        System.out.println("Preparando para salvar");
        System.out.println("EntityManager Pessoa: " + getEntityManager());
        getEntityManager().persist(pessoa);
        System.out.println("ID: " + pessoa.getId());
    }

}
