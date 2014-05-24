package br.com.emmanuelneri.blog.service;

import br.com.emmanuelneri.blog.model.Pessoa;
import br.com.emmanuelneri.blog.util.GenericContainerService;

import javax.ejb.Stateless;
import javax.inject.Named;

@Stateless
@Named
public class PessoaService extends GenericContainerService {

    public void salvar(Pessoa pessoa) {
        getEntityManager().persist(pessoa);
    }

}
