package core_java_basics;

public class ArraysMultiDimensional {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 1, 3 }, { 2, 4, 5, 6 } };
		System.out.println(arr[0][2]);
		System.out.println(arr[1][1]);

		String[][] str = new String[2][3];

		str[0][1] = "Hello world";

		System.out.println(str[0][1]);

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println(str[0][2]);

	}
}
