package core_java_basics.serialization_arrays;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WritingObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Writing objects");

		Contact[] contact = { new Contact(1, "Sam"), new Contact(2, "Samuel"), new Contact(3, "Manoj") };

		ArrayList<Contact> contactList = new ArrayList<Contact>(Arrays.asList(contact));

		try (FileOutputStream fs = new FileOutputStream("test1.txt")) {

			ObjectOutputStream os = new ObjectOutputStream(fs);

			os.writeObject(contact);

			os.writeObject(contactList);

			os.writeObject(contactList.size());

			for (Contact con : contactList) {
				System.out.println(con);
			}

			os.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
