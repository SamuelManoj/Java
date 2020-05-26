package core_java_basics.transients;

import java.io.Serializable;

public class Contact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5793489238797014783L;
	private transient int id;
	private String name;

	public static int count;

	public Contact(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + "]  Count is  " + count;
	}
}
