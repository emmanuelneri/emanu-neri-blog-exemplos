package br.com.emmanuelneri.blog.polimorfismo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculadora {

	public static BigDecimal calcular(BigDecimal valor1, BigDecimal valor2, Operacao operacao) {
		return operacao.calcular(valor1, valor2);
	}
}

enum Operacao {

	ADICAO("+") {
		@Override
		BigDecimal calcular(BigDecimal valor1, BigDecimal valor2) {
			return valor1.add(valor2);
		}
	},
	SUBTRACAO("-") {
		@Override
		BigDecimal calcular(BigDecimal valor1, BigDecimal valor2) {
			return valor1.subtract(valor2);
		}
	},
	MULTIPLICACAO("*") {
		@Override
		BigDecimal calcular(BigDecimal valor1, BigDecimal valor2) {
			return valor1.multiply(valor2);
		}
	},
	DIVISAO("/") {
		@Override
		BigDecimal calcular(BigDecimal valor1, BigDecimal valor2) {
			return valor1.divide(valor2, 2 , RoundingMode.HALF_UP);
		}
	};

	private final String simbolo;

	Operacao(String simbolo) {
		this.simbolo = simbolo;
	}

	abstract BigDecimal calcular(BigDecimal valor1, BigDecimal valor2);

	public String getSimbolo() {
		return simbolo;
	}
}
