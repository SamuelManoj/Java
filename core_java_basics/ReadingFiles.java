package core_java_basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String filename = "text";

		File file = new File(filename);

		Scanner scan = new Scanner(file);
		int value = scan.nextInt();
		System.out.println("Value is" + value);

		scan.nextLine();
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			System.out.println(line);
		}
	}

}
