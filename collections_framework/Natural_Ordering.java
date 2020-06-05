package collections_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Natural_Ordering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list = new ArrayList<Person>();
		SortedSet<Person> set = new TreeSet<Person>();

		addElement(list);
		addElement(set);

		Collections.sort(list);

		showElement(list);
		showElement(set);

	}

	public static void addElement(Collection<Person> col) {
		col.add(new Person("Dog"));
		col.add(new Person("Cat"));
		col.add(new Person("Hen"));
		col.add(new Person("Horse"));
		col.add(new Person("Lion"));
	}

	public static void showElement(Collection<Person> col) {
		for (Person value : col) {
			System.out.println(value);
		}
	}

}

class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person person) {
		// TODO Auto-generated method stub
		int len1 = name.length();
		int len2 = person.name.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		} else {
			return name.compareTo(person.name);
		}
	}

}
