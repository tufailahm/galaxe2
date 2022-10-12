package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Demo1 {

	List<String> names;
	
	public Demo1() {
			names = new ArrayList<String>();
			
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
			System.out.println(names.contains("Pratham"));
			System.out.println(names.get(2));			
			Collections.sort(names);
			System.out.println("=============After sorting");
			Iterator<String> iter = names.iterator();
			
			while(iter.hasNext()) {
				String temp = iter.next(); 
				System.out.println(temp);
			}

			System.out.println(Collections.binarySearch(names, "Jaya"));
		
	}

	public static void main(String[] args) {
			Demo1 d = new Demo1();
	}
}
