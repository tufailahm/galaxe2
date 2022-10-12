package day6;

import java.util.HashSet;
import java.util.Set;

public class Demo4 {

	Set names;

	public Demo4() {
		names = new HashSet();

		names.add("Jaya");
		names.add("Ahmed");
		names.add("Tarun");
		names.add("Prashant");
		names.add("Mohan");

		System.out.println(names);

	//	names.add(2, "Pratham");

		System.out.println(names);

		names.remove(2);
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
		Demo4 d = new Demo4();
	}
}
