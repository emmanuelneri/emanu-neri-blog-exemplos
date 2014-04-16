package br.com.emmanuelneri.blog.jett;

import br.com.emmanuelneri.blog.jett.utils.AbstractJettController;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.HashMap;
import java.util.Map;

@RequestScoped
@ManagedBean
public class StyleController extends AbstractJettController {


    @Override
    protected String getPathExcelTemplate() {
        return "resources/style.xlsx";
    }

    @Override
    protected String getExcelNome() {
        return "style";
    }

    @Override
    protected Map<String, Object> getMapValores() {
        return new HashMap<>();
    }
}
