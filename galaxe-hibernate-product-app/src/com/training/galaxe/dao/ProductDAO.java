package com.training.galaxe.dao;

import java.util.List;

import com.training.galaxe.model.Product;

public interface ProductDAO {
	
		public void saveProduct(Product product);
		public void updateProduct(Product product);
		public void deleteProduct(int productId);
		public Product getProduct(int productId);
		public List<Product> getProduct();
		
		public List<Product> searchProduct(String productName);
		public List<Product> searchProduct(int min,int max);
		public List<Product> checkStockStatus(int minStock);
	

}
