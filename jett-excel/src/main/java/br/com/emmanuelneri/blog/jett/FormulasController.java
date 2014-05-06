package br.com.emmanuelneri.blog.jett;

import br.com.emmanuelneri.blog.jett.utils.AbstractJettController;
import br.com.emmanuelneri.blog.jett.vo.Mes;
import br.com.emmanuelneri.blog.jett.vo.ProdutoVO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestScoped
@ManagedBean
public class FormulasController extends AbstractJettController {

	private final List<ProdutoVO> produtos;

	public FormulasController() {
        produtos = new ArrayList<>();

        produtos.add(new ProdutoVO("Produto 1", 2, BigDecimal.TEN));
        produtos.add(new ProdutoVO("Produto 2", 10, BigDecimal.valueOf(2.75)));
        produtos.add(new ProdutoVO("Produto 3", 20, BigDecimal.valueOf(1.50)));
        produtos.add(new ProdutoVO("Produto 4", 3, BigDecimal.valueOf(100)));

	}

	@Override
	protected String getPathExcelTemplate() {
		return "resources/formulas.xlsx";
	}

	@Override
	protected String getExcelNome() {
		return "formulas";
	}

	@Override
	protected Map<String, Object> getMapValores() {
		final Map<String, Object> mapValores = new HashMap<>();
		mapValores.put("produtos", produtos);

		return mapValores;
	}
}