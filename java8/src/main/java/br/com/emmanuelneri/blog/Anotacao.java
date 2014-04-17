package br.com.emmanuelneri.blog;

@FunctionalInterface
public interface Anotacao<T> {

    boolean valida(T t);

    //No java 8 interfaces podem ter implementacoes, declarando os metodos como default
    default void printT(T t){
        System.out.println(t);
    }

}
