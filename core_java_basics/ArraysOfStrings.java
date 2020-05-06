package core_java_basics;

public class ArraysOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str;
		str = new String[3];

		str[0] = "Hi";
		str[1] = "hello";
		str[2] = "you";

		System.out.println(str[2]);

		String[] sub = { "Hi", "Hellooo", "How" };
		for (String st : sub) {
			System.out.println(st);
		}

		String[] text = new String[3];
		System.out.println(text[2]);

	}

}
