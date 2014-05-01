package br.com.emmanuelneri.blog;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class ContadorController implements Serializable {

    private int numero;

    public ContadorController() {
        numero = 0;
    }

    public void contar() {
        numero++;
    }

    public int getNumero() {
        return numero;
    }
}
