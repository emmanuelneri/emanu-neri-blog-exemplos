package br.com.emmanuelneri.blog.componentes.cpfValidator;

import br.com.emmanuelneri.blog.AbstractController;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class PessoaController extends AbstractController {

	private String nome;
	private String telefone;
	private String email;

	@ManagedProperty(value="#{cpfController}")
	private CpfController cpfController;

	public void salvar() {
		adicionarMensagem(FacesMessage.SEVERITY_INFO, "Nome: " + this.nome);
		adicionarMensagem(FacesMessage.SEVERITY_INFO, "CPF : " + this.cpfController.getCpf());
		adicionarMensagem(FacesMessage.SEVERITY_INFO, "Telefone : " + this.telefone);
		adicionarMensagem(FacesMessage.SEVERITY_INFO, "Email: " + this.email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCpfController(CpfController cpfController) {
		this.cpfController = cpfController;
	}
}
