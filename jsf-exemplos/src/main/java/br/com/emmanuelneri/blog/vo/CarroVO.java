package br.com.emmanuelneri.blog.vo;

import br.com.emmanuelneri.blog.model.Marca;

import java.util.List;

public class CarroVO {

    private String nome;
    private Marca marca;
    private List<ModeloVO> modelos;

    public CarroVO(String nome, Marca marca, List<ModeloVO> modelos) {
        this.nome = nome;
        this.marca = marca;
        this.modelos = modelos;
    }

    public String getNome() {
        return nome;
    }

    public Marca getMarca() {
        return marca;
    }

    public List<ModeloVO> getModelos() {
        return modelos;
    }
}
