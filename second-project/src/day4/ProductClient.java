package day4;

public class ProductClient {

	public static void main(String[] args) {
		
		Product product1;
		try {
			product1 = new Product(100, "Aroma", 100, 999);
			System.out.println(product1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Thanks for using my product app");
	}
}