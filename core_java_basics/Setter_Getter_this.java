package core_java_basics;

public class Setter_Getter_this {
	public static void main(String[] args) {
		School school = new School();
		school.setName("Sam");
		school.setAge(30);

		System.out.println("Name is " + school.getName() + " and age is " + school.getAge());
	}
}

class School {
	int age;
	String name;

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

}