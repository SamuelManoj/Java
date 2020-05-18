package core_java_basics;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("first");
		list.add("second");
		list.add("third");

		String value = list.get(1);

		System.out.println(value);
	}

}
