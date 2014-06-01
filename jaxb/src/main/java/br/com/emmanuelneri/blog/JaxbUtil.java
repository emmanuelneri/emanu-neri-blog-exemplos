package br.com.emmanuelneri.blog;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public final class JaxbUtil {

    private JaxbUtil() {}

    public static <T> T ler(String pathArquivo, Class<T> type) throws JAXBException {
        final File file = new File(pathArquivo);

        return ler(file, type);
    }

    public static <T> T ler(File file, Class<T> type) throws JAXBException {
        final JAXBContext jaxbContext = JAXBContext.newInstance(type);
        final Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        return (T) jaxbUnmarshaller.unmarshal(file);
    }

}
