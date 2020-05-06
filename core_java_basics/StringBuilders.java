package core_java_basics;

public class StringBuilders {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("");
		str.append("hi");
		str.append(" ");
		str.append("Samuel");

		System.out.println(str.toString());

		str.append("  hi").append(" ").append("Second").append(" ").append("Line");

		System.out.println(str.toString());
	}

}
