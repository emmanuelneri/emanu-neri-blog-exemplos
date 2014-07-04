import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.omnifaces.util.Faces;
import org.omnifaces.util.Messages;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import java.io.IOException;

@Named
@RequestScoped
public class LoginController {

    private String login;
    private String senha;

    public void autenticar() throws IOException {
        try {
            SecurityUtils.getSubject().login(new UsernamePasswordToken(login, senha));
            Faces.redirect("/pages/index.xhtml");
        } catch (AuthenticationException aex) {
            aex.printStackTrace();
            Messages.addGlobalError("Login incorreto");
        }
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
