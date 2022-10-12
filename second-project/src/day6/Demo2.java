package day6;

import java.util.LinkedList;
import java.util.List;

public class Demo2 {

	List names;
	
	public Demo2() {
			names = new LinkedList();
			
			names.add("Jaya");
			names.add("Ahmed");
			names.add("Tarun");
			names.add("Prashant");
			names.add("Mohan");
			
			System.out.println(names);
			
			names.add(2, "Pratham");
			
			System.out.println(names);
			
			names.remove(2);
			System.out.println(names);

			names.remove("Mohan");
			System.out.println(names);
			
			System.out.println(names.size());
			System.out.println(names.isEmpty());
			//names.clear();
			System.out.println(names.isEmpty());
			
			System.out.println(names.contains("Pratham"));
			
			System.out.println(names.get(2));

	}

	public static void main(String[] args) {
			Demo2 d = new Demo2();
	}
}
