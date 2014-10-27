package br.com.emmanuelneri.blog;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Funcionario {

    @EmbeddedId
    private FuncionarioId funcionarioId;

    private String email;

    public FuncionarioId getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(FuncionarioId funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
