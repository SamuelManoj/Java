package core_java_basics;

public class ClassesAndObjects {
	public static void main(String[] args) {

		ClassesAndObjects_dependency dep = new ClassesAndObjects_dependency();
		dep.id = 1;
		dep.name = "Sam";
		dep.age = 25;

		System.out.println(dep.id);
		System.out.println(dep.name);
		dep.print();

		int age = dep.calculate();
		System.out.println(age);

		String name = dep.getName();
		System.out.println(name);
	}

}
