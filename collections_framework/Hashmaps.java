package collections_framework;

import java.util.HashMap;
import java.util.Map;

public class Hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "one");
		map.put(3, "three");
		map.put(2, "two");
		map.put(7, "seven");
		map.put(9, "nine");

		map.put(1, "hello");

		System.out.println(map.get(1));

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + ":" + value);
		}
	}

}
