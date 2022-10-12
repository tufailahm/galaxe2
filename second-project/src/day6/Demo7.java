package day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import day4.Product;

public class Demo7 {

	List<Product> products;
	
	public Demo7() {
			products = new ArrayList<Product>();
			
			Product product1 = new Product(109, "Lakme", 90, 899);
			Product product2 = new Product(709, "Aroma", 190, 1899);
			Product product3 = new Product(23, "Sunscreen", 66, 66);
			
			products.add(product1);
			products.add(product2);
			products.add(product3);
			products.add(new Product(726, "Bags", 99, 2999));
			
			
			Iterator<Product> productsIterator = products.iterator();
			
			while(productsIterator.hasNext()) {
				Product temp = productsIterator.next();
				System.out.println(temp);
			}


	}

	public static void main(String[] args) {
			Demo7 d = new Demo7();
	}
}
