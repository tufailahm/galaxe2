package day6;

import java.util.Set;
import java.util.TreeSet;

public class Demo5 {

	Set<String> names;

	public Demo5() {
		names = new TreeSet<String>();

		names.add("Jaya");
		names.add("Ahmed");
		names.add("Tarun");
		names.add("Prashant");
		names.add("Mohan");

		System.out.println(names);

	//	names.add(2, "Pratham");

		System.out.println(names);

		names.remove("Jaya");
		System.out.println(names);

		names.remove("Mohan");
		System.out.println(names);

		names.add("Isha");
		
		System.out.println(names.size());
		System.out.println(names.isEmpty());
		// names.clear();
		System.out.println(names.isEmpty());

		System.out.println(names.contains("Pratham"));

		System.out.println(names);

	}

	public static void main(String[] args) {
		Demo5 d = new Demo5();
	}
}
