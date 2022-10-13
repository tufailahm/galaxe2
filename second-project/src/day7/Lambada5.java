package day7;
import java.util.ArrayList;
import java.util.List;

public class Lambada5 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Tufail");
		names.add("Ahmed");
		
		
		//consumer
		names.forEach(n -> System.out.println(n));
		
		names.forEach(System.out::println);
		
		
		
	}
}