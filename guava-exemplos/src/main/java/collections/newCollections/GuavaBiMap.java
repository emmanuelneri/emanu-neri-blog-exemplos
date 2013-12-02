package collections.newCollections;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;

public class GuavaBiMap {

	public static void main(String args[]) {
		criarBiMap();
	}

	private static void criarBiMap() {
		BiMap<Integer, String> biMap = HashBiMap.create();
		biMap.put(1, "Jose");
		biMap.put(2, "Joao");

		System.out.println(biMap.get(1)); // Jose
		System.out.println(biMap.inverse().get("Joao")); // 2
	}

}
