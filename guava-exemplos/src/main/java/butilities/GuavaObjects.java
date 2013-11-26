package butilities;


import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

public class GuavaObjects implements Comparable<GuavaObjects> {

	public static void main(String args[]) {
		firstNonNul();
		equals();
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

	private static void equals() {
		System.out.println(Objects.equal("a", "a")); //  true
		System.out.println(Objects.equal(null, "a")); //  false
		System.out.println(Objects.equal("a", null)); //  false
		System.out.println(Objects.equal(null, null)); //  true
	}


	private String descricao;
	private TipoObjects tipo;

	@Override
	public int compareTo(GuavaObjects that) {
		return ComparisonChain.start()
				.compare(this.descricao, that.descricao)
				.compare(this.tipo, that.tipo, Ordering.natural().nullsLast())
				.result();
	}

	enum TipoObjects {
		CHECK,
		VALIDADE
		;
	}
}


