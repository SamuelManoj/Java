package collections_framework;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

class Custume {
	private int id;
	private String name;

	Custome(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "{" + id + ";" + name + "}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Custome other = (Custome) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

public class CustumeObjects_Sets_and_Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Custume, Integer> hash = new HashMap<Custume, Integer>();

		Custume cus1 = new Custume(1, "Sam");
		Custume cus2 = new Custume(2, "Samuel");
		Custume cus3 = new Custume(1, "Sam");
		Custume cus4 = new Custume(4, "manoj");

		hash.put(cus1, 1);
		hash.put(cus2, 2);
		hash.put(cus3, 3);
		hash.put(cus4, 4);

		for (Custume key : hash.keySet()) {
			System.out.println(key + ":" + hash.get(key));
		}

		Set<Custume> set = new LinkedHashSet<Custume>();

		set.add(cus1);
		set.add(cus2);
		set.add(cus3);
		set.add(cus4);

		for (Custume value : set) {
			System.out.println(value);
		}
	}

}
