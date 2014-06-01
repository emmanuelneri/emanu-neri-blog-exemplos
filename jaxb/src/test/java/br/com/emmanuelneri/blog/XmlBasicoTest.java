package br.com.emmanuelneri.blog;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.xml.bind.JAXBException;

@RunWith(JUnit4.class)
public class XmlBasicoTest {

    private static final String LOCAL_ARQUIVO = "/src/test/java/br/com/emmanuelneri/blog/arquivos/";

    @Test
    public void ler() throws JAXBException {
        final XmlBasico xml = JaxbUtil.ler(System.getProperty("user.dir")
                + LOCAL_ARQUIVO + "teste-basico.xml", XmlBasico.class);

        Assert.assertNotNull(xml);
        Assert.assertEquals(xml.getNome(), "Teste");
        Assert.assertEquals(xml.getValor(), "10");
    }

}
