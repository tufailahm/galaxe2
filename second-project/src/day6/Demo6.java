package day6;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo6 {

	Set names;

	public Demo6() {
		names = new LinkedHashSet();

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
		Demo6 d = new Demo6();
	}
}
