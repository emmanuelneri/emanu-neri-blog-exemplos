package collections.utilityClass;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class GuavaFluentIterable {

	public static void main(String args[]) {
		fluentIterableTransformandoTipos();
		fluentIterableFiltrandoElementosLista();
		fluentIterableAgrupandoElementosMap();
	}

	private static void fluentIterableTransformandoTipos() {
		List<Integer> listInteger = ImmutableList.of(1, 2, 3, 4, 5, 6, 7 ,8 , 9, 10);

		List<String> listString = FluentIterable
									.from(listInteger)
									.transform(Functions.toStringFunction())
									.limit(5)
									.toList();
		System.out.println(listString);    //[1, 2, 3, 4, 5]
	}

	private static void fluentIterableFiltrandoElementosLista() {
		List<Integer> listInteger = ImmutableList.of(1, 2, 3, 4, 5, 6, 7 ,8 , 9, 10);

		System.out.println(FluentIterable
						   		.from(listInteger)
								.filter(new Predicate<Integer>() {
									@Override
									public boolean apply(Integer input) {
										return (input >= 3) && (input <= 8);
									}
								})
								.toList());  //[3, 4, 5, 6, 7, 8]
	}

	private static void fluentIterableAgrupandoElementosMap() {
		List<Pessoa> pessoas = ImmutableList.of(new Pessoa("Jose", 18), new Pessoa("Maria", 23), new Pessoa("Joao", 18));

		Map<Integer, Collection<Pessoa>> mapIdades = FluentIterable
														.from(pessoas)
														.index(new Function<Pessoa, Integer>() {
															@Override
															public Integer apply(Pessoa pessoa) {
																return pessoa.getIdade();
															}
														}).asMap();
		System.out.println(mapIdades);  //{18=[Jose - 18 anos, Joao - 18 anos], 23=[Maria - 23 anos]}
	}
}

class Pessoa {

	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	int getIdade() {
		return idade;
	}

	void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return this.nome +" - "+ this.getIdade() + " anos";
	}
}


