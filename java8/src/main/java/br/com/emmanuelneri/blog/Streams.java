package br.com.emmanuelneri.blog;

import br.com.emmanuelneri.blog.classes.Pessoa;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams {

    public static void filtrarMaioresDeIdade() {

        final List<Pessoa> pessoas = criarPessoas();

        pessoas.stream()
                .filter(pessoa -> pessoa.getIdade() >= 18);

        pessoas.forEach(System.out::println); //Pessoa 1 Pessoa 2 Pessoa 3  Pessoa 4 Pessoa 5

       final List<Pessoa> pessoasMaioresIdade = pessoas.stream()
               .filter(pessoa -> pessoa.getIdade() >= 18)
               .collect(Collectors.toList());

        pessoasMaioresIdade.forEach(System.out::println); //Pessoa 1 Pessoa 2 Pessoa 3

    }

    public static void listarIdades() {
        final List<Pessoa> pessoas = criarPessoas();

        final List<Integer> idades = pessoas.stream()
                .map(Pessoa::getIdade)
                .collect(Collectors.toList());

        System.out.println(idades);
    }

    public static void somaIdades() {
        final List<Pessoa> pessoas = criarPessoas();

        final int total = pessoas.stream()
                .mapToInt(Pessoa::getIdade)
                .sum();

        System.out.println(total);
    }


    public static List<Pessoa> criarPessoas() {
        Pessoa pessoa1 = new Pessoa("Pessoa 1", 18);
        Pessoa pessoa2 = new Pessoa("Pessoa 2", 20);
        Pessoa pessoa3 = new Pessoa("Pessoa 3", 23);
        Pessoa pessoa4 = new Pessoa("Pessoa 4", 15);
        Pessoa pessoa5 = new Pessoa("Pessoa 5", 17);

        return Arrays.asList(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5);
    }

    public static void transformarLista() {
        List<Pessoa> pessoas = criarPessoas();


        System.out.println(pessoas.stream().map(new Function<Pessoa, String>() {
            @Override
            public String apply(Pessoa pessoa) {
                return pessoa.getNome();
            }
        }).collect(Collectors.toList()));

    }
}
