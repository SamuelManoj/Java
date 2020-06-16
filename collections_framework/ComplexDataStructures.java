package collections_framework;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexDataStructures {

	public static String[] transport = { 
			"car", "bike", "bicycle" };

	public static String[][] fuel = { 
			{ "petrol", "diesel", "gas" }, 
			{ "petrol", "gas" }, 
			{ "no fuel" } };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Set<String>> details = new HashMap<>();

		for (int i = 0; i < transport.length; i++) {
			String transports = transport[i];
			String[] fuelList = fuel[i];

			Set<String> fuelSet = new LinkedHashSet<>();

			for (String fuel : fuelList) {
				fuelSet.add(fuel);
			}

			details.put(transports, fuelSet);
		}

		Set<String> fuelList1 = details.get("bike");

		for (String fuel : fuelList1) {
			System.out.println(fuel);
		}

		for (String trans : details.keySet()) {
			System.out.print(trans);
			System.out.print(": ");

			Set<String> fuelList2 = details.get(trans);

			for (String fuel : fuelList2) {
				System.out.print(fuel);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
