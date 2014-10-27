package br.com.emmanuelneri.blog;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Usuario {

    @Id
    private Long id;

    @NotNull(message = "{usuario.null}")
    @Size(min = 5, max = 20, message = "{usuario.login.size}")
    private String login;

    public Usuario(String login) {
        this.login = login;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
