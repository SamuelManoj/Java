package core_java_basics.serialization;

import java.io.Serializable;

public class Contact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5793489238797014783L;
	private int id;
	private String name;

	public Contact(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + "]";
	}
}
