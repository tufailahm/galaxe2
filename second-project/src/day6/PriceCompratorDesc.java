package day6;

import java.util.Comparator;

import day4.Product;

public class PriceCompratorDesc implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getPrice() > o2.getPrice())
		return -1;
		else
			return 0;
	}

}
