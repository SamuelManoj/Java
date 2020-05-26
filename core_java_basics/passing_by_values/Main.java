package core_java_basics.passing_by_values;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();

		int value = 7;

		System.out.println("1. value is: " + value);

		main.show(value);

		System.out.println("4.value is:" + value);

		Person person = new Person("Sam");

		System.out.println("1.Person name is :" + person);

		main.show(person);

		System.out.println("4.Person name is :" + person);

	}

	public void show(int value) {
		System.out.println("2. value is:" + value);

		value = 5;

		System.out.println("3. value is" + value);
	}

	public void show(Person person) {
		System.out.println("2.Person name is :" + person);

		person = new Person("Samuel");

		System.out.println("3.Person name is :" + person);

	}

}
