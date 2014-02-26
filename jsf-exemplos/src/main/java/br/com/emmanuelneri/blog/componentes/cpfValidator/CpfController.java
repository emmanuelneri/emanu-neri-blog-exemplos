package br.com.emmanuelneri.blog.componentes.cpfValidator;

import br.com.emmanuelneri.blog.AbstractController;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CpfController extends AbstractController{

	private String cpf;
	private boolean valido;

	public void validar() {

		if(cpf.isEmpty()) {
			adicionarMensagem(FacesMessage.SEVERITY_ERROR, "CPF não pode ser vazio");
		} else if(cpf.length() != 11) {
			adicionarMensagem(FacesMessage.SEVERITY_ERROR, "CPF não possui 11 caracteres");
		} else {
			adicionarMensagem(FacesMessage.SEVERITY_INFO, "CPF válido");
			valido = true;
		}

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isValido() {
		return valido;
	}
}
