package collections_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> animals = new ArrayList<String>();

		animals.add("Dog");
		animals.add("Cat");
		animals.add("Hen");
		animals.add("Horse");
		animals.add("Lion");

		// Sorting by String length
		System.out.println("-----------Sorting by String Length-----------");
		Collections.sort(animals, new StringLength());

		for (String animal : animals) {
			System.out.println(animal);
		}

		// Sorting by Alphabetic order
		System.out.println("-----------Sorting by Alphabetic Orde-----------");
		Collections.sort(animals, new AlphabeticOrder());

		for (String animal : animals) {
			System.out.println(animal);
		}

		// Sorting by Reverse Alphabetic order
		System.out.println("-----------Sorting by Reverse Alphabetic Orde-----------");
		Collections.sort(animals, new ReverseAlphabeticOrder());

		for (String animal : animals) {
			System.out.println(animal);
		}

		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(10);
		numbers.add(1);
		numbers.add(12);
		numbers.add(14);
		numbers.add(11);

		System.out.println("-----------Sorting the numbers-----------");
		Collections.sort(numbers);

		for (int number : numbers) {
			System.out.println(number);
		}

		System.out.println("-----------Sorting the numbers is reverse order-----------");
		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return -o1.compareTo(o2);
			}

		});

		for (int number : numbers) {
			System.out.println(number);
		}
	}

}

class StringLength implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		int len1 = o1.length();
		int len2 = o2.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		}
		return 0;
	}

}

class AlphabeticOrder implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}

class ReverseAlphabeticOrder implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}

}
