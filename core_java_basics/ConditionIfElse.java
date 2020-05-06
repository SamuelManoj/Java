package core_java_basics;

public class ConditionIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		if (i < 10) {
			System.out.println("True");
		} else if (i < 10) {
			System.out.println("false");
		} else {
			System.out.println("condition");
		}
		while (true) {
			System.out.println("running" + i);
			if (i == 15) {
				break;
			}
			i++;
		}
	}

}
