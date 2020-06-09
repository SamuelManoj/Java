package collections_framework;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();

		list.add("hi");
		list.add("hello");
		list.add("how are you");

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);

			if (value == "hello") {
				it.remove();
			}
		}

		for (String li : list) {
			System.out.println(li);
		}
	}

}
