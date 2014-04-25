package br.com.emmanuelneri.blog;

import br.com.emmanuelneri.blog.classes.Pessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Collections {

    private static final List<Pessoa> pessoas = criarPessoas();

    private void forEach() {
        Consumer<Pessoa> consumer = (Pessoa pessoa) -> System.out.println(pessoa.getNome());

        pessoas.forEach(consumer);
        pessoas.forEach(pessoa -> System.out.println(pessoa.getNome()));

    }

    private void removeIf() {
        List<Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa("Pessoa 1", 18));
        lista.add(new Pessoa("Pessoa 2", 20));
        lista.add(new Pessoa("Pessoa 3", 23));

        Predicate<Pessoa> predicate = new Predicate<Pessoa>() {
            @Override
            public boolean test(Pessoa pessoa) {
                return pessoa.getIdade() == 23;
            }
        };
        lista.removeIf(predicate);

        //com Lambda
        lista.removeIf(p -> p.getIdade() == 20);
    }

    public static List<Pessoa> criarPessoas() {
        Pessoa pessoa1 = new Pessoa("Pessoa 1", 18);
        Pessoa pessoa2 = new Pessoa("Pessoa 2", 20);
        Pessoa pessoa3 = new Pessoa("Pessoa 3", 23);

        return Arrays.asList(pessoa1, pessoa2, pessoa3);
    }

}
