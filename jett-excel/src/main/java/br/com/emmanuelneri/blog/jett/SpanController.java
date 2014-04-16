package br.com.emmanuelneri.blog.jett;

import br.com.emmanuelneri.blog.jett.utils.AbstractJettController;
import br.com.emmanuelneri.blog.jett.vo.PessoaVO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.*;

@RequestScoped
@ManagedBean
public class SpanController extends AbstractJettController {

    private final List<PessoaVO> pessoas;

    public SpanController() {
        pessoas = new ArrayList<>();

        for(int i = 0; i <= 10; i++) {
            pessoas.add(new PessoaVO("Pessoa"+i,
                    String.format("email%d@gmail.com", i)));
        }
    }

    @Override
    protected String getPathExcelTemplate() {
        return "resources/span.xlsx";
    }

    @Override
    protected String getExcelNome() {
        return "span";
    }

    @Override
    protected Map<String, Object> getMapValores() {
        Map<String, Object> map =  new HashMap<>();
        map.put("pessoas", pessoas);

        return map;
    }
}
