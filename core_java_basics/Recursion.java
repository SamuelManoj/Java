package core_java_basics;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(7));
	}

	private static int factorial(int value) {

		if (value == 1) {
			return 1;
		}
		
		return value * factorial(value - 1);
	}

}
