package br.com.emmanuelneri.blog;

import br.com.emmanuelneri.blog.vo.PessoaVO;
import br.com.emmanuelneri.blog.vo.Sexo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ManagedBean
@ViewScoped
public class FormularioBootstrapController implements Serializable {

	private List<PessoaVO> pessoas;
	private List<Sexo> sexos;

	private PessoaVO pessoa;

	public FormularioBootstrapController() {
		this.pessoa = new PessoaVO();
		this.pessoas = new ArrayList<>();
		this.sexos = Arrays.asList(Sexo.values());
	}

	public void adicionar() {
		this.pessoas.add(pessoa);
		this.pessoa = new PessoaVO();
	}

	public void remover(PessoaVO pessoa) {
		pessoas.remove(pessoa);
	}

	public List<PessoaVO> getPessoas() {
		return pessoas;
	}

	public List<Sexo> getSexos() {
		return sexos;
	}

	public PessoaVO getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaVO pessoa) {
		this.pessoa = pessoa;
	}
}
