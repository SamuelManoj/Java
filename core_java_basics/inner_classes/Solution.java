package core_java_basics.inner_classes;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Machine machine = new Machine(1);
		machine.start();

		Machine.Comp comp = new Machine.Comp();
		comp.display();

	}

}
