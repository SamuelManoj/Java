package collections_framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arraylist = new ArrayList<Integer>();
		List<Integer> linkedlist = new LinkedList<Integer>();

		calculateTiming("ArrayList", arraylist);
		calculateTiming("LinkedList", linkedlist);

	}

	public static void calculateTiming(String type, List<Integer> list) {

		long start = System.currentTimeMillis();

		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}

		long stop = System.currentTimeMillis();

		System.out.println("Time taken for " + type + " to add numbers at the end is " + (stop - start) + " ms");

		start = System.currentTimeMillis();

		for (int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}

		stop = System.currentTimeMillis();

		System.out.println("Time taken for " + type + " to add numbers at the beginning is " + (stop - start) + " ms");

	}
}
