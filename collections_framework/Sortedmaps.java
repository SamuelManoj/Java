package collections_framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sortedmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedHashmap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();

		System.out.println("HashMap:");
		testMap(map);

		System.out.println("LinkedHashMap:");
		testMap(linkedHashmap);

		System.out.println("TreeMap:");
		testMap(treemap);

	}

	public static void testMap(Map<Integer, String> map) {

		map.put(1, "one");
		map.put(3, "three");
		map.put(2, "two");
		map.put(7, "seven");
		map.put(9, "nine");

		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}
}
