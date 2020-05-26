package core_java_basics.serialization_arrays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadingObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Reading Objects");

		try (FileInputStream fi = new FileInputStream("test.bin")) {

			ObjectInputStream is = new ObjectInputStream(fi);

			Contact[] contact1 = (Contact[]) is.readObject();

			@SuppressWarnings("unchecked")
			ArrayList<Contact> contactList = (ArrayList<Contact>) is.readObject();

			for (Contact contact : contact1) {
				System.out.println(contact);
			}

			for (Contact each : contactList) {
				System.out.println(each);
			}

			int num = is.readInt();

			for (int i = 0; i < num; i++) {
				Contact con = (Contact) is.readObject();
				System.out.println(con);
			}

			is.close();

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
