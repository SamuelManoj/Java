package core_java_basics.enum_types;

public enum Animal {
	CAT("catname"), DOG("dogname"), LION("Lionname");

	private String name;

	Animal(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "Name is " + name;
	}
}
