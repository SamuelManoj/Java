package core_java_basics;

import java.util.Scanner;

public class LoopsDoWhile {
	public static void main(String[] args) {
		int x;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Enter the number");
			x = scan.nextInt();
		} while (x != 5);
		System.out.println("Got 5!");
	}
}
