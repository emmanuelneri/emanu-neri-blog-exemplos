package br.com.emmanuelneri.blog.shiro.security;

import br.com.emmanuelneri.blog.shiro.model.Funcionalidade;
import br.com.emmanuelneri.blog.shiro.model.Usuario;
import br.com.emmanuelneri.blog.shiro.service.UsuarioService;
import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;

import javax.inject.Inject;
import java.util.Arrays;

public class UsuarioRealm extends AuthorizingRealm {

    @Inject
    private UsuarioService usuarioService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        Usuario usuarioPrincipal = principalCollection.oneByType(Usuario.class);
        if (usuarioPrincipal == null) {
            throw new AuthorizationException("Invalid credentials");
        }

        final Usuario usuario = usuarioService.findByLogin(usuarioPrincipal.getLogin());

        if (usuario != null) {
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

            info.addRoles(FluentIterable.from(usuario.getFuncionalidades())
                    .transform(new Function<Funcionalidade, String>() {
                        @Override
                        public String apply(Funcionalidade funcionalidade) {
                            return funcionalidade.toString();
                        }
                    }).toSet());

            return info;
        } else {
            return null;
        }
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

        final Usuario usuario = usuarioService.findByLogin(token.getUsername());

        if (usuario != null) {
            return new SimpleAuthenticationInfo(
                    usuario.getLogin(), usuario.getSenha().toCharArray(), "usuarioRealm");
        } else {
            return null;
        }
    }
}
