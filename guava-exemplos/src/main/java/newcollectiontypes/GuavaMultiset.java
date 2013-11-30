package newcollectiontypes;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;

public class GuavaMultiset {

	public static void main(String args[]) {
		criarMultiset();
	}

	private static void criarMultiset() {
		Multiset<String> multiset = HashMultiset.create(Lists.newArrayList("a", "b", "a", "b", "c", "d"));
		System.out.println(multiset); //[d, b x 2, c, a x 2]   'b' 2 vezes e 'a' 2 vezes

		System.out.println(multiset.elementSet());    //[d, b, c, a]
	}

}
