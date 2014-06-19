package br.com.emmanuelneri.blog.chat;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class ResponseChat {

    private String autor;
    private String mensagem;
    private Date data;

    public ResponseChat(String autor, String mensagem) {
        this.autor = autor;
        this.mensagem = mensagem;
        this.data = new Date();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getData() {
        return data;
    }
}
