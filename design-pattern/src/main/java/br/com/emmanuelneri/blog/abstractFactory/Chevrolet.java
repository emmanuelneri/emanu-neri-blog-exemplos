package br.com.emmanuelneri.blog.abstractFactory;

public class Chevrolet extends CarroFactory {

	@Override
	public Carro criarCarroHatch() {
		return new Celta();
	}

	@Override
	public Carro criarCarroSedan() {
		return new Prisma();
	}
}
