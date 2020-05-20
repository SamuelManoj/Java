package core_java_basics.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Writing objects");

		Contact contact1 = new Contact(1, "Sam");
		Contact contact2 = new Contact(2, "Samuel");

		try (FileOutputStream fs = new FileOutputStream("test1.txt")) {

			ObjectOutputStream os = new ObjectOutputStream(fs);

			os.writeObject(contact1);
			os.writeObject(contact2);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
