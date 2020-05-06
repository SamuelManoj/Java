package core_java_basics;

public class Static_and_Final {

	public static void main(String[] args) {

		Info.description = "This is Samuel";
		System.out.println("Count before staring " + Info.count);
		Info.description();

		Info info1 = new Info();
		Info info2 = new Info();
		info1.name = "Samuel";
		info2.name = "Manoj";
		info1.showCase();
		info2.showCase();

		System.out.println("Count after the ending " + Info.count);
		System.out.println(Info.LUCK);
	}
}

class Info {
	public final static int LUCK = 7;
	public static String description;
	public int id;
	public String name;
	public static int count = 0;

	Info() {
		this.id = count;
		count++;
	}

	public static void description() {
		System.out.println(Info.description);

	}

	public void showCase() {
		System.out.println("The id is " + id + " and name is " + name);
	}

}
