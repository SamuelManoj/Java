package core_java_basics;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class ExceptionMultiple {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		openfile();
	}

	public static void openfile() throws IOException, ParseException {
		File file = new File("test.txt");

		FileReader fr = new FileReader(file);

	}
}
