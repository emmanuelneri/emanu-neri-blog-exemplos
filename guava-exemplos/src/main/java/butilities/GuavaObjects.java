package butilities;


import com.google.common.base.Objects;

public class GuavaObjects {

	public static void main(String args[]) {
		firstNonNul();
	}

	/*
    	Substituio o primeiro valor passado(T) pelo o segundo(T) caso seja null
	 */
	private static void firstNonNul() {
		Integer numero = null;
		System.out.println(Objects.firstNonNull(numero, 0)); // 0

		numero = 1;
		System.out.println(Objects.firstNonNull(numero, 0)); // 1
	}

}
