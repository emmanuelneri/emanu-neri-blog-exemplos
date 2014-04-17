package br.com.emmanuelneri.blog;


import br.com.emmanuelneri.blog.classes.Pessoa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodReferences {

    public void virarAno() {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.forEach(Pessoa :: acrecentarIdade);
    }

}
