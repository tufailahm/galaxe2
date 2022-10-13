package day6;

import java.util.Comparator;

import day4.Product;

public class ProductNameComparator implements Comparator<Product> {
	@Override
	public int compare(Product o1, Product o2) {
		if (o1.getProductName().compareTo(o2.getProductName())>0)
			return 0;
		else
			return -1;
	}
}
