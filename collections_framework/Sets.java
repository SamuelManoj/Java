package collections_framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashSet = new HashSet<String>();
		Set<String> linkedSet = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>();

		if (hashSet.isEmpty()) {
			System.out.println("Set is empty");
		}
		testSet(hashSet);
		intersection(hashSet);
		difference(hashSet);

		testSet(linkedSet);

		testSet(treeSet);

		for (String element : hashSet) {
			System.out.println(element);
		}

		if (hashSet.contains("S3")) {
			System.out.println("S3 is present");
		}

	}

	public static void testSet(Set<String> set) {

		set.add("S3");
		set.add("DynamoDB");
		set.add("Redshift");
		set.add("SWF");
		set.add("SQS");

		System.out.println(set);

		set.add("SQS");

		System.out.println(set);

	}

	public static void intersection(Set<String> set) {
		Set<String> set2 = new HashSet<String>();

		set2.add("S3");
		set2.add("SWF");
		set2.add("SNS");
		set2.add("Athena");

		Set<String> intersection = new HashSet<String>(set);

		System.out.println("Intersection value is :" + intersection);

		intersection.retainAll(set2);

		System.out.println("Intersection final value is :" + intersection);

	}

	public static void difference(Set<String> set) {

		Set<String> set2 = new HashSet<String>();

		set2.add("S3");
		set2.add("SWF");
		set2.add("SNS");
		set2.add("Athena");

		Set<String> difference = new HashSet<String>(set);

		System.out.println("difference value is :" + difference);

		difference.removeAll(set2);

		System.out.println("difference final value is :" + difference);

	}

}
