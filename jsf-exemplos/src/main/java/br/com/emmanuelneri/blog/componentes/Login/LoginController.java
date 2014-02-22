package br.com.emmanuelneri.blog.componentes.Login;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class LoginController {

	private static final String MSG_SUCESS = "Login efetuado com sucesso!";
	private static final String MSG_ERROR = "Login ou senha incorreta, tente novamente";

	private String login;
	private String senha;

	public String logar() {
		if (this.login.equals("emmanuel") && this.senha.equals("123")) {
			addMessage(FacesMessage.SEVERITY_INFO, MSG_SUCESS);
			return "login";
		} else {
			final String msg = "";
			addMessage(FacesMessage.SEVERITY_ERROR, MSG_ERROR);
			return "login";
		}
	}

	private void addMessage(FacesMessage.Severity msgSeverity, String msg) {
		FacesMessage facesMsg =new FacesMessage(msgSeverity, msg, msg);
		FacesContext.getCurrentInstance().addMessage(null, facesMsg);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
