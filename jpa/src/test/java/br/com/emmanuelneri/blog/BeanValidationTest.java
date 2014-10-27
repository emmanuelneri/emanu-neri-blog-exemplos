package br.com.emmanuelneri.blog;

import org.junit.Assert;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class BeanValidationTest {

    private final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    private final Validator validator = factory.getValidator();
    private final ResourceBundle bundle = ResourceBundle.getBundle("ValidationMessages", Locale.getDefault());

    @Test
    public void validarNotNull() {
        final Usuario usuarioLoginNull = new Usuario(null);

        final Set<ConstraintViolation<Usuario>> constraintViolations = validator.validate(usuarioLoginNull);

        Assert.assertEquals(1, constraintViolations.size());

        for(ConstraintViolation<Usuario> constraintViolation : constraintViolations) {
            Assert.assertEquals(bundle.getString("usuario.null"), constraintViolation.getMessage());
        }
    }

    @Test
    public void validarSize() {
        final Usuario usuarioLoginSizeInvalido = new Usuario("adm");

        final Set<ConstraintViolation<Usuario>> constraintViolations = validator.validate(usuarioLoginSizeInvalido);

        Assert.assertEquals(1, constraintViolations.size());

        String resultado = bundle.getString("usuario.login.size");
        resultado = resultado.replace("{min}" , String.valueOf(5));
        resultado = resultado.replace("{max}" , String.valueOf(20));

        for(ConstraintViolation<Usuario> constraintViolation : constraintViolations) {
            Assert.assertEquals(resultado, constraintViolation.getMessage());
        }
    }

    @Test
    public void valido() {
        final Usuario usuarioOK = new Usuario("emmanuelneri");

        final Set<ConstraintViolation<Usuario>> constraintViolations = validator.validate(usuarioOK);

        Assert.assertEquals(0, constraintViolations.size());
    }

}
