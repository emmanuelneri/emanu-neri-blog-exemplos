package collections.newCollections;

import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.Table;

import java.math.BigDecimal;
import java.util.Map;

public class GuavaClassToInstanceMap {

	public static void main(String args[]) {
		criarClassToInstanceMap();
	}

	private static void criarClassToInstanceMap() {
		ClassToInstanceMap<Number> numberMap = MutableClassToInstanceMap.create();
		numberMap.putInstance(Integer.class, 10);
		numberMap.putInstance(BigDecimal.class, BigDecimal.valueOf(100));


	}

}
