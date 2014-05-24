package br.com.emmanuelneri.blog.model;

public enum Pergunta {

    PERGUNTA_1("Pergunta 1"),
    PERGUNTA_2("Pergunta 2"),
    PERGUNTA_3("Pergunta 3")
    ;

    private final String descricao;

    private Pergunta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}