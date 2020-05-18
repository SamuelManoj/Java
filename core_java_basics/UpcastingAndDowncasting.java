package core_java_basics;

public class UpcastingAndDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine machine1 = new Machine();
		Car car1 = new Car();
		machine1.start();
		car1.start();

		// Upcasting
		Machine machine2 = car1;
		machine2.start();

		// downcasting
		Machine machine3 = new Car();
		Car car3 = (Car) machine3;
		car3.start();
	}

}

class Machine {
	public void start() {
		System.out.println("Machine started");
	}
}

class Car extends Machine {
	public void start() {
		System.out.println("Car started");
	}
}
