package core_java_basics;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		int[] arrays;
		arrays = new int[3];

		System.out.println("Enter the values of array");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			arrays[i] = scan.nextInt();
		}
		for (int i = 0; i < arrays.length; i++) {
			System.out.println("The values are " + arrays[i]);
		}

		int[] arr = { 1, 2, 3 };
		for (int i = 0; i < arrays.length; i++) {
			System.out.println("The values are " + arr[i]);
		}

	}
}
