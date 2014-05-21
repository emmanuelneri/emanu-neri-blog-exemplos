package br.com.emmanuelneri.blog.service;

import br.com.emmanuelneri.blog.model.Pessoa;
import br.com.emmanuelneri.blog.util.GenericService;

import javax.inject.Named;

@Named
public class PessoaService extends GenericService {

    public void salvar(Pessoa pessoa) {
        getEntityManager().persist(pessoa);
    }

}
