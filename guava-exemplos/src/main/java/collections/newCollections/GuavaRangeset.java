package collections.newCollections;

import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.Sets;
import com.google.common.collect.TreeRangeSet;

import java.util.HashSet;

public class GuavaRangeset {

	public static void main(String args[]) {
	   criarRangeSet();
	}

	private static void criarRangeSet() {
		RangeSet<Integer> rangeSet = TreeRangeSet.create();
		rangeSet.add(Range.open(1, 10));
		rangeSet.add(Range.open(10, 20));
		rangeSet.add(Range.open(20, 30));

		System.out.println(rangeSet); //{(1‥20)(20‥30)}
		System.out.println(rangeSet.rangeContaining(10)); //null
		System.out.println(rangeSet.rangeContaining(11)); //(10‥20)
		System.out.println(rangeSet.contains(10));   //false
		System.out.println(rangeSet.contains(11));   //true
		System.out.println(rangeSet.span()); //{(1‥30]}

		RangeSet<Integer> rangeSet2 = TreeRangeSet.create();
		rangeSet2.add(Range.closed(1, 10));
		rangeSet2.add(Range.closed(10, 20));
		rangeSet2.add(Range.closed(20, 30));

		System.out.println(rangeSet2); //{(1‥30]}
	}

}
