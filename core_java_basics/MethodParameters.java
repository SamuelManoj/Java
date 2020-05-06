package core_java_basics;

public class MethodParameters {

	public static void main(String[] args) {
		Values values = new Values();
		values.talk("Hi");
		values.id(2);
		values.entry("Hi", 3);
	}

}

class Values {
	void talk(String text) {
		System.out.println(text);
	}

	void id(int id) {
		System.out.println(id);
	}

	void entry(String s, int i) {
		System.out.println("The name is " + s + " and id" + i);
	}
}
