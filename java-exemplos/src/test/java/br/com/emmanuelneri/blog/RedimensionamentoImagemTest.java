package br.com.emmanuelneri.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.*;

/**
 * @author Emmanuel Neri
 * http://emanu-neri.blogspot.com.br/
 */
@RunWith(JUnit4.class)
public class RedimensionamentoImagemTest {

    @Test
    public void redimensionar() throws IOException {
        File arquivo = new File("/Users/emmanuelneri/Desktop/imagem/original/foto.jpg");
        InputStream inputStream = new FileInputStream(arquivo);

       RedimensionamentoImagem.redimecionarImagem(inputStream, "/Users/emmanuelneri/Desktop/imagem/redimensionada/foto.jpg");
    }

}