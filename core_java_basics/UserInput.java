package core_java_basics;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {

		Scanner value = new Scanner(System.in);
		System.out.println("enter user input");

		String x = value.nextLine();
		System.out.println("enter the input is " + x);

	}
}
