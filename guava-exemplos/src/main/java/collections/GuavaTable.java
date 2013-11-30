package collections;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Table;

import java.util.Map;

public class GuavaTable {

	public static void main(String args[]) {
		criarTable();
	}

	private static void criarTable() {
		Table<String, String, Integer> table = HashBasedTable.create();
		table.put("CRUZE", "JANEIRO", 100);
		table.put("ONIX", "JANEIRO", 1000);

		System.out.println(table.columnKeySet()); //[JANEIRO]
		System.out.println(table.rowKeySet()); //[CRUZE, ONIX]

		Map<String,Integer> mapRows = table.row("ONIX");
		System.out.println(mapRows); //JANEIRO=1000

		Map<String,Integer> mapColuns = table.column("JANEIRO");
		System.out.println(mapColuns); // CRUZE=100, ONIX=1000
	}

}
