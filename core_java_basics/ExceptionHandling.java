package core_java_basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		openfile();
	}

	public static void openfile() throws FileNotFoundException {
		File file = new File("test.txt");

		FileReader fr = new FileReader(file);

	}
}
