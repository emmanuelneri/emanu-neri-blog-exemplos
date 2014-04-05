package collections.utilityClass;


import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.List;

public class GuavaIterable {

	public static void main(String args[]) {
//		metodosEstaticos();
		frequency();
	}

	private static void metodosEstaticos() {
		List<String> list = Lists.newArrayList("AAAAAA", "BBBBB", "CCCCC", "AAAAAA");
		System.out.println(Iterables.getLast(list));    //AAAAAA
		System.out.println(Iterables.partition(list, 2));   //[[AAAAAA, BBBBB], [CCCCC, AAAAAA]]

		System.out.println(Iterables.frequency(list, "AAAAAA"));   //2

		List<String> list2 = Lists.newArrayList("XXXX", "ZZZZ");
		System.out.println(Iterables.concat(list, list2));   //   [AAAAAA, BBBBB, CCCCC, AAAAAA, XXXX, ZZZZ]
	}

	private static void frequency() {
	 	List<Produto> produtos = Lists.newArrayList(new Produto("Mouse", 1) ,
				new Produto("Teclado", 1), new Produto("Notebook", 2));

		System.out.println(FluentIterable.from(produtos).filter(new Predicate<Produto>() {
			@Override
			public boolean apply(Produto produto) {
				return produto.getCategoria() == 1;
			}
		}).size());
	}


}

class Produto {

	private final String nome;
	private final int categoria;

	Produto(String nome, int categoria) {
		this.nome = nome;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public int getCategoria() {
		return categoria;
	}
}
