package br.com.emmanuelneri.blog;

import br.com.emmanuelneri.blog.vo.PessoaVO;
import br.com.emmanuelneri.blog.vo.Sexo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class FormularioBootstrapController {

	private List<PessoaVO> pessoas;

	public FormularioBootstrapController() {
		this.pessoas = new ArrayList<>();

		for(int i =0; i < 5; i++) {
		   pessoas.add(new PessoaVO("Nome"+i, "Sobrenome", Sexo.MASCULINO));
		}

	}

	public List<PessoaVO> getPessoas() {
		return pessoas;
	}
}
