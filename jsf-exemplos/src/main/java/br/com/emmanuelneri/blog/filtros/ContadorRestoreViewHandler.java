package br.com.emmanuelneri.blog.filtros;

import javax.faces.application.ViewHandler;
import javax.faces.application.ViewHandlerWrapper;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

public class ContadorRestoreViewHandler extends ViewHandlerWrapper {
    private final ViewHandler parent;

    public ContadorRestoreViewHandler(ViewHandler parent) {
        this.parent = parent;
    }

    @Override
    public ViewHandler getWrapped() {
        return parent;
    }

    @Override
    public UIViewRoot restoreView(FacesContext context, String viewId) {
        UIViewRoot root = super.restoreView(context, viewId);
        if (root == null
                && ((HttpServletRequest) context.getExternalContext().getRequest()).getAttribute("contadorFiltrado") != null) {
            root = createView(context, viewId);
        }

        return root;
    }
}
