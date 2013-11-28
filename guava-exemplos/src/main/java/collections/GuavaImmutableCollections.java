package collections;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

public class GuavaImmutableCollections {

	public static void main(String args[]) {
		criandoColecoes();
		convertendoColecoes();
	}

	private static void criandoColecoes() {
		ImmutableList lista = ImmutableList.of("y", "b", "z", "c", "d", "z"); //[y, b, z, c, d, z]
		System.out.println(lista);

		ImmutableSet set = ImmutableSet.of("a", "b", "c", "c", "d", "z");  //[a, b, c, d, z]
		System.out.println(set);

		ImmutableMap map = ImmutableMap.of("1", 10, "2", 20, "3", 30);
		System.out.println(map); // {1=10, 2=20, 3=30}
	}

	private static void convertendoColecoes() {
		ImmutableSet set = ImmutableSet.of("a", "b", "c", "c", "d", "z");
		ImmutableList lista = set.asList();  //[a, b, c, d, z]
		System.out.println(lista);
	}

}
