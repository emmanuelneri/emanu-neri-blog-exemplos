package br.com.emmanuelneri.blog;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.xml.bind.JAXBException;
import java.math.BigDecimal;

@RunWith(JUnit4.class)
public class XmlComBigDeciamalTest {

    private static final String LOCAL_ARQUIVO = "/src/test/java/br/com/emmanuelneri/blog/arquivos/";

    @Test
    public void lerArquivoValores() throws JAXBException {
        final XmlComBigDeciamal xml = JaxbUtil.ler(System.getProperty("user.dir")
                + LOCAL_ARQUIVO + "teste-com-bigdecimal.xml", XmlComBigDeciamal.class);

        Assert.assertNotNull(xml);
        Assert.assertEquals(xml.getNome(), "Teste");
        Assert.assertTrue(new BigDecimal("10.50").compareTo(xml.getValor()) == 0);
    }

}
