package core_java_basics;

public class ClassesAndObjects_dependency {
	int id;
	int age;
	String name;

	void print() {
		System.out.println("The person id is " + id + " and name is " + name);
	}

	int calculate() {
		return 60 - age;
	}

	String getName() {
		return name;
	}
}
