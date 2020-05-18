package core_java_basics.interfaces;

public class Car implements Info {
	public void start() {
		System.out.println("Car Started");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Car Info Started");

	}
}
