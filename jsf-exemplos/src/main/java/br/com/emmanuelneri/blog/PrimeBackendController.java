package br.com.emmanuelneri.blog;

import org.primefaces.context.RequestContext;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

@ManagedBean(name = "primeBackendController")
@RequestScoped
public class PrimeBackendController {

    public void abrirDialog() {
        RequestContext context = RequestContext.getCurrentInstance();
        context.execute("dlg3.show()");
    }

}