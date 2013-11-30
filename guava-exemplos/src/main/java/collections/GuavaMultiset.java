package collections;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;

public class GuavaMultiset {

	public static void main(String args[]) {
		criarMultiset();
		validarMultiset();
	}

	private static void criarMultiset() {
		Multiset<String> multiset = HashMultiset.create(Lists.newArrayList("a", "b", "a", "b", "c", "d"));
		System.out.println(multiset); //[d, b x 2, c, a x 2]   'b' 2 vezes e 'a' 2 vezes

		System.out.println(multiset.elementSet());    //[d, b, c, a]
		System.out.println(multiset.count("b"));    //2

		System.out.println(multiset.size());    //6
		System.out.println(multiset.elementSet().size());    //4
	}

	private static void validarMultiset() {
		Multiset<String> multiset = HashMultiset.create();

		System.out.println(multiset.contains("a"));  // false
	}

}
