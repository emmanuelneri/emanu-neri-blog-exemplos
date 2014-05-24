package br.com.emmanuelneri.blog.service;

import br.com.emmanuelneri.blog.model.Pessoa;
import br.com.emmanuelneri.blog.util.GenericService;

import javax.inject.Named;
import javax.transaction.Transactional;

@Named
public class PessoaService extends GenericService {

    @Transactional
    public void salvar(Pessoa pessoa) {
        getEntityManager().persist(pessoa);
    }

}
