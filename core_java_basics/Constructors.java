package core_java_basics;

public class Constructors {
	public static void main(String[] args) {
//		Table table1 = new Table();
//		Table table2 = new Table(1);
		Table table3 = new Table(2, "Sam");

	}
}

class Table {
	int id;
	String name;

	public Table() {
		System.out.println("First constructor running");
	}

	public Table(int id) {
		this();
		this.id = id;
		System.out.println("2nd constructor running");
	}

	public Table(int id, String name) {
		this(id);
		this.id = id;
		this.name = name;
		System.out.println("3rd constructor running");
	}
}