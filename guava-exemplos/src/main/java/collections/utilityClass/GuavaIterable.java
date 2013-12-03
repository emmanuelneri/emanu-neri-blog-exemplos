package collections.utilityClass;


import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.List;

public class GuavaIterable {

	public static void main(String args[]) {
		metodosEstaticos();
	}

	private static void metodosEstaticos() {
		List<String> list = Lists.newArrayList("AAAAAA", "BBBBB", "CCCCC", "AAAAAA");
		System.out.println(Iterables.getLast(list));    //AAAAAA
		System.out.println(Iterables.partition(list, 2));   //[[AAAAAA, BBBBB], [CCCCC, AAAAAA]]

		System.out.println(Iterables.frequency(list, "AAAAAA"));   //2

		List<String> list2 = Lists.newArrayList("XXXX", "ZZZZ");
		System.out.println(Iterables.concat(list, list2));   //   [AAAAAA, BBBBB, CCCCC, AAAAAA, XXXX, ZZZZ]
	}

}
