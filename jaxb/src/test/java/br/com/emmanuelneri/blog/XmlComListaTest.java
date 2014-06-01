package br.com.emmanuelneri.blog;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.xml.bind.JAXBException;

@RunWith(JUnit4.class)
public class XmlComListaTest {

    private static final String LOCAL_ARQUIVO = "/src/test/java/br/com/emmanuelneri/blog/arquivos/";

    @Test
    public void lerArquivoLista() throws JAXBException {
        final XmlComLista xml = JaxbUtil.ler(System.getProperty("user.dir")
                + LOCAL_ARQUIVO + "teste-com-lista.xml", XmlComLista.class);

        Assert.assertNotNull(xml);
        Assert.assertEquals(xml.getNome(), "Teste Lista");
        Assert.assertNotNull(xml.getBasicos());
        Assert.assertTrue(xml.getBasicos().size() == 3);

    }

}
