package br.com.emmanuelneri.blog.jett.utils;

import net.sf.jett.transform.ExcelTransformer;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.omnifaces.util.Faces;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public final class JettUtil {

	private JettUtil() {}

	public static void gerarExcel(final String templateResourcePath, final String fileName,	final Map<String, Object> values) throws IOException, InvalidFormatException {

		final File templateFile = new File(Faces
				.getRealPath(templateResourcePath));

		final ByteArrayOutputStream bout = new ByteArrayOutputStream();
		final ExcelTransformer transformer = new ExcelTransformer();
		final Workbook workbook = WorkbookFactory.create(templateFile);

		transformer.transform(workbook, values);
		workbook.write(bout);

		Faces.sendFile(bout.toByteArray(), fileName, false);
	}

}