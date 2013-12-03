package collections.utilityClass;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StaticConstructors {

	public static void main(String args[]) {
		construtoresPadroes();
		convertendoTipos();
	}

	private static void construtoresPadroes() {
		List<String> list = Lists.newArrayList();
		Set<String> set = Sets.newHashSet();
		Map<Integer, String> map = Maps.newTreeMap();

		System.out.println(Lists.newArrayList("AAA", "BBB")); //  [AAA, BBB]
		System.out.println(Ints.asList(10, 20, 30)); //[10, 20, 30]
	}

	private static void convertendoTipos() {
		Set<String> set = Sets.newHashSet("AAAA", "BBBB", "CCCC");
		List<String> list = Lists.newArrayList(set);
		System.out.println(list);  //[BBBB, AAAA, CCCC]
	}

}
