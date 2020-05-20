package core_java_basics.inner_classes;

public class Machine {

	private int id;

	public Machine(int id) {
		this.id = id;
	}

	private class Lap {
		public void print() {
			System.out.println("Laptop printing" + id);
		}
	}

	static class Comp {
		public void display() {
			System.out.println("Computer display");
		}
	}

	public void start() {
		System.out.println("Machine started");

		Lap lap = new Lap();
		lap.print();

		class Temp {
			public void middle() {
				System.out.println("Temp printing");
			}
		}

		Temp temp = new Temp();
		temp.middle();
	}
}
