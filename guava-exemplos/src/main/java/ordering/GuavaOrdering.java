package ordering;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;

import java.util.List;

public class GuavaOrdering {

	private static final List<String> lista = Lists.newArrayList("aaaaa", "cccc", "xxxxx", "bbbbb");

	public static void main(String args[]) {
		System.out.println(lista.toString()); //[aaaaa, cccc, xxxxx, bbbbb]
		ordenacao();
		pegandoValores();
	}

	private static void ordenacao() {
		System.out.println(Ordering.natural().sortedCopy(lista));  //[aaaaa, bbbbb, cccc, xxxxx]
		System.out.println(Ordering.natural().reverse().sortedCopy(lista));  //[xxxxx, cccc, bbbbb, aaaaa]
	}

	private static void pegandoValores() {
		System.out.println(Ordering.natural().min(lista));  //aaaaa
		System.out.println(Ordering.natural().max(lista));  //xxxxx

	}
}
