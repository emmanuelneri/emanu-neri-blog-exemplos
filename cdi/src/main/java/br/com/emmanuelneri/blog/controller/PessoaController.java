package br.com.emmanuelneri.blog.controller;

import br.com.emmanuelneri.blog.model.Pessoa;
import br.com.emmanuelneri.blog.service.PessoaService;

import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class PessoaController implements Serializable{

    private Pessoa pessoa;

    @Inject
    private PessoaService pessoaService;

    public PessoaController() {
        this.pessoa = new Pessoa();
    }

    public String salvar() {
        this.pessoaService.salvar(this.pessoa);

        System.out.println(this.pessoa);
        System.out.println(this.pessoa.getNome());
        System.out.println(this.pessoa.getId());

        return "pessoa";
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
