package core_java_basics.interfaces;

public class Solutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine mach1 = new Machine();
		mach1.start();
		mach1.display();

		Car car1 = new Car();
		car1.start();
		car1.display();

		OutputInfo(car1);
		OutputInfo(mach1);

	}

	private static void OutputInfo(Info info) {
		info.display();
	}

}
