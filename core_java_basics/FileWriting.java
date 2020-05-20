package core_java_basics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("text.txt");
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			br.write("First line");
			br.newLine();
			br.write("Second Line");
			br.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable  to read " + file.toString());
		}
	}
}
