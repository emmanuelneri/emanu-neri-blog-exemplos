package br.com.emmanuelneri.blog.vo;

public final class PessoaVO {

	private String nome;
	private String sobrenome;
	private Sexo sexo;

	public PessoaVO(String nome, String sobrenome, Sexo sexo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public Sexo getSexo() {
		return sexo;
	}
}
