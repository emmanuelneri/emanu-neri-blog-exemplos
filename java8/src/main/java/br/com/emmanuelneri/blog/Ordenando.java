package br.com.emmanuelneri.blog;


import br.com.emmanuelneri.blog.classes.Pessoa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ordenando {

    private void ordenacoesPadroes() {
        List<String> textos = new ArrayList<>();

        textos.sort(Comparator.naturalOrder());
        textos.sort(Comparator.reverseOrder());
    }

    private void ordenandoPrimitivos() {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.sort(Comparator.comparingInt(p -> p.getIdade()));

        //method references
        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade));
    }

    private void referenciandoMetodosComArgumentos() {
        List<Pessoa> pessoas = new ArrayList<>();

        //imprime o toString do objeto
        pessoas.forEach(System.out::print);
    }

}
