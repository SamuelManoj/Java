package core_java_basics.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Reading Objects");

		try (FileInputStream fi = new FileInputStream("test.bin")) {

			ObjectInputStream is = new ObjectInputStream(fi);

			Contact contact1 = (Contact) is.readObject();
			Contact contact2 = (Contact) is.readObject();

			is.close();

			System.out.println(contact1);
			System.out.println(contact2);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
