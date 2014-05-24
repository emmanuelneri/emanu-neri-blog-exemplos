package br.com.emmanuelneri.blog;

import br.com.emmanuelneri.blog.model.Pergunta;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@ManagedBean
@ViewScoped
public class PerguntaController implements Serializable {

    public List<Pergunta> getPerguntas() {
        return Arrays.asList(Pergunta.values());
    }

}


