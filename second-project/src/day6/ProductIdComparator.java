package day6;

import java.util.Comparator;

import day4.Product;

public class ProductIdComparator implements Comparator<Product> {

	public ProductIdComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Product o1, Product o2) {
		if (o1.getProductId() < o2.getProductId())
			return -1;
		else
			return 0;
	}

}
