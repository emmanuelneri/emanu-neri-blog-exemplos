package br.com.emmanuelneri.blog.collections;


import java.math.BigDecimal;
import java.util.*;

public class MapOrdenado {

    public static void main(String args[]) {
        final Map<BigDecimal, String> mapOrdenadorPorChave = criarMapOrdenadoPorChave();

        for(BigDecimal bigDecimal : mapOrdenadorPorChave.keySet()) {
            System.out.println(mapOrdenadorPorChave.get(bigDecimal));
        }

        final Map<String, BigDecimal> mapOrdenadorPorValor = criarMapOrdenadorPorValor();

        for(String nome : mapOrdenadorPorValor.keySet()) {
            System.out.println(mapOrdenadorPorValor.get(nome));
        }
    }

    public static Map<BigDecimal, String> criarMapOrdenadoPorChave() {
        Map<BigDecimal, String> treeMap =  new TreeMap<>();
        treeMap.put(BigDecimal.TEN, "10");
        treeMap.put(BigDecimal.ONE, "1");
        treeMap.put(BigDecimal.ZERO, "0");
        treeMap.put(BigDecimal.valueOf(100), "100");
        treeMap.put(BigDecimal.valueOf(15), "15");

        return treeMap;
    }


    public static Map<String, BigDecimal> criarMapOrdenadorPorValor() {
        Map<String, BigDecimal> map = new HashMap<>();
        map.put("Comprador 1" , BigDecimal.TEN);
        map.put("Comprador 2" , BigDecimal.ONE);
        map.put("Comprador 3" , BigDecimal.ZERO);
        map.put("Comprador 4" , BigDecimal.valueOf(100));
        map.put("Comprador 5" , BigDecimal.valueOf(15));
        map.put("Comprador 6" , BigDecimal.valueOf(15));


        List<Map.Entry<String, BigDecimal>> listEntrySets = new ArrayList<>(map.entrySet());
        Collections.sort(listEntrySets, new Comparator<Map.Entry<String, BigDecimal>>() {
            public int compare(Map.Entry<String, BigDecimal> o1, Map.Entry<String, BigDecimal> o2) {
                final int resultadoValor = (o1.getValue()).compareTo(o2.getValue());
                return resultadoValor != 0
                        ? resultadoValor
                        : (o1.getKey()).compareTo(o2.getKey());
            }
        });

        Map<String, BigDecimal> linkedHashMap = new LinkedHashMap<>();
        for(Map.Entry<String, BigDecimal> entry :listEntrySets) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }

        return linkedHashMap;
    }

}
