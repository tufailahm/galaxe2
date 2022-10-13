package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

		Collections.sort(products);
		System.out.println("Sorting based on QOH -----");
		Iterator<Product> productsIterator = products.iterator();

		while (productsIterator.hasNext()) {
			Product temp = productsIterator.next();
			System.out.println(temp);
		}

		// Sort on price - Desc

		Collections.sort(products, new PriceCompratorDesc());
		System.out.println("Sorting based on Price Desc -----");
		Iterator<Product> productsIterator1 = products.iterator();

		while (productsIterator1.hasNext()) {
			Product temp = productsIterator1.next();
			System.out.println(temp);
		}

		// Sort on product id -asc

		Collections.sort(products, new ProductIdComparator());
		System.out.println("Sorting based on product id asc -----");
		Iterator<Product> productsIterator2 = products.iterator();

		while (productsIterator2.hasNext()) {
			Product temp = productsIterator2.next();
			System.out.println(temp);
		}

		// Sort on product name -asc

		Collections.sort(products, new ProductNameComparator());
		System.out.println("Sorting based on product id asc -----");
		Iterator<Product> productsIterator3 = products.iterator();

		while (productsIterator3.hasNext()) {
			Product temp = productsIterator3.next();
			System.out.println(temp);
		}
		
		
		//Sort on product id desc
		Collections.sort(products,new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if(o1.getProductId() > o2.getProductId())
				return -1;
				else
					return 0;
			}
		});
		System.out.println("Sorting based on product id desc -----");
		Iterator<Product> productsIterator4 = products.iterator();

		while (productsIterator4.hasNext()) {
			Product temp = productsIterator4.next();
			System.out.println(temp);
		}
		
		
		
		//
		Collections.sort(products,new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if(o1.getPrice() > o2.getPrice())
				return 0;
				else
					return -1;
			}
		});
		
		System.out.println("Sorting based on price asc -----");
		Iterator<Product> productsIterator5 = products.iterator();

		while (productsIterator5.hasNext()) {
			Product temp = productsIterator5.next();
			System.out.println(temp);
		}
		
		
		Comparator<Product> compPrice = (o1,o2) ->  { if (o1.getPrice() > o2.getPrice())  return 0; else return -1; };
		Collections.sort(products,compPrice);
		
		System.out.println("##############Sorting based on price asc -----Lambdas");
		Iterator<Product> productsIterator6 = products.iterator();

		while (productsIterator6.hasNext()) {
			Product temp = productsIterator6.next();
			System.out.println(temp);
		}
		
	}

	public static void main(String[] args) {
		Demo7 d = new Demo7();
	}
}
