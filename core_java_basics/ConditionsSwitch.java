package core_java_basics;

import java.util.Scanner;

public class ConditionsSwitch {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner scan = new Scanner(System.in);
		String x = scan.nextLine();

		switch (x) {
		case "start":
			System.out.println("Its started");
			break;
		case "stop":
			System.out.println("its stopped");
			break;
		default:
			System.out.println("Default");
			break;
		}
	}
}
