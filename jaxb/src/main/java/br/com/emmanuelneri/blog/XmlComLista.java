package br.com.emmanuelneri.blog;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class XmlComLista {

    private String nome;

    private List<XmlBasico> basicos;

    public String getNome() {
        return nome;
    }

    public List<XmlBasico> getBasicos() {
        return basicos;
    }

    @XmlElement
    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlElement(name = "valor")
    public void setBasicos(List<XmlBasico> basicos) {
        this.basicos = basicos;
    }

}
