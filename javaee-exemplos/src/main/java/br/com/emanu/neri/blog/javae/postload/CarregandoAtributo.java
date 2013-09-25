package br.com.emanu.neri.blog.javae.postload;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PostLoad;
import javax.persistence.Transient;

@Entity
public class CarregandoAtributo {
	
	@Id
	private Long id;

	private BigDecimal valorVenda;
	
	@Transient
	private BigDecimal valorInicialVenda;
	
	@PostLoad
	private void iniciarValorVenda() {
		this.valorInicialVenda = this.valorVenda;
	}
}
