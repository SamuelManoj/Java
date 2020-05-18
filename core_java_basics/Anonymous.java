package core_java_basics;

public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine machine1 = new Machine() {
			@Override
			public void start() {
				System.out.println("New Machine started");
			}
		};
		machine1.start();

		Info info = new Info() {
			@Override
			public void display() {
				System.out.println("Info displayed");
			}
		};
		info.display();
	}

}

class Machine {
	public void start() {
		System.out.println("Machine Started");
	}
}

interface Info {
	public void display();
}
