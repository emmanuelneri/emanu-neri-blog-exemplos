package br.com.emmanuelneri.blog.polimorfismo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.math.BigDecimal;

/**
 * @author Emmanuel Neri
 * http://emanu-neri.blogspot.com.br/
 */
@RunWith(JUnit4.class)
public class CalculadoraTest {

	@Test
	public void calcular() {

		Assert.assertEquals(BigDecimal.valueOf(150), Calculadora.calcular
				(BigDecimal.valueOf(100), BigDecimal.valueOf(50), Operacao.ADICAO));

		Assert.assertEquals(BigDecimal.valueOf(100), Calculadora.calcular
				(BigDecimal.valueOf(150), BigDecimal.valueOf(50), Operacao.SUBTRACAO));

		Assert.assertEquals(BigDecimal.valueOf(63), Calculadora.calcular
				(BigDecimal.valueOf(9), BigDecimal.valueOf(7), Operacao.MULTIPLICACAO));

		Assert.assertEquals(new BigDecimal("60.00"), Calculadora.calcular
				(BigDecimal.valueOf(120), BigDecimal.valueOf(2), Operacao.DIVISAO));

	}

}
