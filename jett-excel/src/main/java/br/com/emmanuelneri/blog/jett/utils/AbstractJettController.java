package br.com.emmanuelneri.blog.jett.utils;

import javax.faces.application.FacesMessage;
import java.util.Map;

public abstract class AbstractJettController {

	protected abstract String getPathExcelTemplate();

	protected abstract String getExcelNome();

	protected abstract Map<String, Object> getMapValores();

	public void gerarExcel() {
		try {
			JettUtil.gerarExcel(getPathExcelTemplate(), getExcelNome(), getMapValores());
			JsfUtil.adicionarMensagem(FacesMessage.SEVERITY_INFO, "Excel gerado com sucesso!");
		} catch (Exception e) {
			JsfUtil.adicionarMensagem(FacesMessage.SEVERITY_ERROR, "Problemas ao gerar excel.");
			e.printStackTrace();
		}
	}

}
