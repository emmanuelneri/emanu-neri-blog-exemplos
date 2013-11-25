package preconditions;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

public class GuavaPreconditions {

	public static void main(String args[]) {
		checkArgument();
		checkNotNull();
	}

	private static void checkArgument() {
		//valida condição está true senão lança exceção
		Preconditions.checkArgument(false, "Inválido!"); //java.lang.IllegalArgumentException: Inválido!
	}

	private static void checkNotNull() {
		//valida condição não nula senão lança exceção
		Integer numero = 0;
		Preconditions.checkNotNull(numero, "Inválido!"); // está ok, não retorna nada

		numero = null;
		Preconditions.checkNotNull(numero, "Inválido!"); //java.lang.NullPointerException: Inválido!
	}

}
