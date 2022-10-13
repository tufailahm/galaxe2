package day6;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

	public MapDemo() {
	}
	public static void main(String[] args) {
		Map<String, Integer> employees = new LinkedHashMap<String, Integer>();
		
		employees.put("Tarun",76000);
		employees.put("Neha",576000);
		employees.put("Isha",276000);
		employees.put("Jaya",176000);
		
		System.out.println(employees.get("Isha"));
		
		System.out.println(employees);
	}
}
