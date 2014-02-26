package br.com.emmanuelneri.blog;


import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.io.Serializable;

public abstract class AbstractController implements Serializable {

	protected void adicionarMensagem(FacesMessage.Severity severity, String msg) {
		FacesMessage facesMsg = new FacesMessage(severity, "", msg);
		FacesContext.getCurrentInstance().addMessage("", facesMsg);
	}
}
