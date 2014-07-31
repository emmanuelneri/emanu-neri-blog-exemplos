package br.com.emmanuelneri.blog.shiro.model;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.util.Set;

@Entity
@NamedQueries({
        @NamedQuery(name = "Usuario.findByLogin", query = "select u from Usuario u where u.login = :login")
})
public class Usuario {

    @Id
    private Long id;

    @Column
    private String login;

    @Column
    private String senha;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "usuario_funcionalidades", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "funcionalidade")
    private Set<Funcionalidade> funcionalidades;

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Set<Funcionalidade> getFuncionalidades() {
        return funcionalidades;
    }

    public void setFuncionalidades(Set<Funcionalidade> funcionalidades) {
        this.funcionalidades = funcionalidades;
    }
}
