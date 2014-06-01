package br.com.emmanuelneri.blog;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class XmlBasico {

    private String nome;
    private String valor;

    public String getNome() {
        return nome;
    }

    @XmlElement
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    @XmlElement
    public void setValor(String valor) {
        this.valor = valor;
    }
}
