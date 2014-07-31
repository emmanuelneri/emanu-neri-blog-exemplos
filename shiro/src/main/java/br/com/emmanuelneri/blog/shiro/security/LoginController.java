package br.com.emmanuelneri.blog.shiro.security;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.omnifaces.util.Messages;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import java.io.IOException;

@Named
@RequestScoped
public class LoginController {

    private String login;
    private String senha;


    public LoginController() {
        System.out.println(" ------------- LoginController -----------------");
    }

    public void autenticar() throws IOException {
        try {
            System.out.println("-----------Autenticar");
            System.out.println("LOgin: " + login);
            System.out.println("Senha: " + senha);

            SecurityUtils.getSubject().login(new UsernamePasswordToken("1", "1"));
//            SavedRequest savedRequest = WebUtils.getAndClearSavedRequest(Faces.getRequest());
//            Faces.redirect(savedRequest != null ? savedRequest.getRequestUrl() : HOME_URL);


            System.out.println("Principal: " + SecurityUtils.getSubject().getPrincipal());

            System.out.println(" ------------- FIM Autenticar ");


//            Faces.redirect("/pages/index.xhtml");
        } catch (UnknownAccountException uae) {
            Messages.addGlobalError("Login incorreto");
        } catch (IncorrectCredentialsException ice ) {
            Messages.addGlobalError("Login incorreto");
        } catch (AuthenticationException ae) {
            ae.printStackTrace();
            Messages.addGlobalFatal("Falha ao executar login");
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
        System.out.println(login);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
