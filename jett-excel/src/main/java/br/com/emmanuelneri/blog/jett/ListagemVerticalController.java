package br.com.emmanuelneri.blog.jett;

import br.com.emmanuelneri.blog.jett.utils.AbstractJettController;
import br.com.emmanuelneri.blog.jett.vo.PessoaVO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestScoped
@ManagedBean
public class ListagemVerticalController extends AbstractJettController {

	private final List<PessoaVO> pessoas;

	public ListagemVerticalController() {
		pessoas = new ArrayList<>();

		for(int i = 0; i <= 10; i++) {
			pessoas.add(new PessoaVO("Pessoa"+i,
					String.format("email%d@gmail.com", i)));
		}
	}

	@Override
	protected String getPathExcelTemplate() {
		return "resources/listagem-vertical.xlsx";
	}

	@Override
	protected String getExcelNome() {
		return "listagem-vertical";
	}

	@Override
	protected Map<String, Object> getMapValores() {
		final Map<String, Object> mapValores = new HashMap<>();
		mapValores.put("pessoas", pessoas);

		return  mapValores;
	}
}
