package br.com.emmanuelneri.blog;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

/**
 * @author Emmanuel Neri
 * http://emanu-neri.blogspot.com.br/
 */
public class RedimensionamentoImagem {

    private static int tamanhoMaximo = 800;

    public static void redimecionarImagem(InputStream inputStream, String caminhoDestino) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        Image thumbnail = bufferedImage.getScaledInstance(bufferedImage.getWidth() < 800 ? bufferedImage.getWidth() : tamanhoMaximo, -1, Image.SCALE_SMOOTH);
        BufferedImage bufferedThumbnail = new BufferedImage(thumbnail.getWidth(null), thumbnail.getHeight(null), BufferedImage.TYPE_INT_RGB);
        bufferedThumbnail.getGraphics().drawImage(thumbnail, 0, 0, null);
        ImageIO.write(bufferedThumbnail, "jpeg", new File(caminhoDestino));
    }
}