package collections;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multiset;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class GuavaMultimap {

	public static void main(String args[]) {
		criarMultimap();
		validarMultimap();
		atribuir();
	}

	private static void criarMultimap() {
		Multimap<String, Integer> multimap  = ArrayListMultimap.create();

		multimap.put("AAA", 10);
		multimap.put("AAA", 20);
		multimap.put("BBB", 50);
		multimap.put("CCC", 100);

		System.out.println(multimap); //{BBB=[50], AAA=[10, 20], CCC=[100]}

		System.out.println(multimap.size()); //4
		System.out.println(multimap.keySet().size()); //3

		Collection<Integer> listAAA = multimap.get("AAA");
		System.out.println(listAAA);  //[10, 20]
	}

	private static void validarMultimap() {
		Multimap<String, Integer> multimap  = ArrayListMultimap.create();

		System.out.println(multimap.get("AAA") == null);  // false
		System.out.println(multimap.get("AAA").isEmpty()); //true

		System.out.println(multimap.containsKey("AAA"));  // false
	}

	private static void atribuir() {
		Multimap<String, Integer> multimap  = ArrayListMultimap.create();

		Map<String, Collection<Integer>> map = multimap.asMap();
	}

}
