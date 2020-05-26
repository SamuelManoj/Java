package collections_framework;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> number = new ArrayList<Integer>();

		number.add(10);
		number.add(20);
		number.add(30);

		System.out.println(number.get(0));

		System.out.println("Iteration 1:");

		for (int i = 0; i < number.size(); i++) {
			System.out.println(number.get(i));
		}

		number.remove(number.size() - 1);
		number.remove(0);

		System.out.println("Iteration 2:");

		for (Integer value : number) {
			System.out.println(value);
		}

	}

}
