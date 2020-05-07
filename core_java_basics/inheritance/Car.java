package core_java_basics.Inheritance;

public class Car extends Machine {

	public void start() {
		System.out.println("Car started");
	}

	public void going() {
		System.out.println("Car is moving");
	}

	public void carName() {
		System.out.println("Car name is " + name);
	}
}
