package br.com.emmanuelneri.blog;

import br.com.emmanuelneri.blog.adapters.BigDecimalAdapterXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;

@XmlRootElement
public class XmlComBigDeciamal {

    private String nome;
    private BigDecimal valor;

    public String getNome() {
        return nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    @XmlElement
    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlElement
    @XmlJavaTypeAdapter(value = BigDecimalAdapterXml.class)
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
