package core_java_basics;

import java.util.ArrayList;

public class GenericsAndWildcards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Mike> list1 = new ArrayList<>();
		list1.add(new Mike());
		list1.add(new Mike());

		ArrayList<Speaker> list2 = new ArrayList<>();
		list2.add(new Speaker());
		list2.add(new Speaker());

		showlist1(list1);
		showlist1(list2);

		showlist2(list1);

		showlist3(list2);
	}

	public static void showlist1(ArrayList<?> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}

	public static void showlist2(ArrayList<? extends Mike> list) {
		for (Mike value : list) {
			System.out.println(value);
		}
	}

	public static void showlist3(ArrayList<? super Speaker> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}

}

class Mike {

	@Override
	public String toString() {
		return "Mike started";
	}
}

class Speaker extends Machine {

	@Override
	public String toString() {
		return "Speaker started";
	}

}
