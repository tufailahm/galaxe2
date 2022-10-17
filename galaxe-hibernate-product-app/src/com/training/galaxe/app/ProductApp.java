package com.training.galaxe.app;

import java.util.Scanner;

import com.training.galaxe.dao.ProductDAO;
import com.training.galaxe.dao.ProductDAOImpl;
import com.training.galaxe.model.Product;

public class ProductApp {

	Scanner scanner = new Scanner(System.in);
	ProductDAO productDAO = new ProductDAOImpl();
	int productId,price,quantityOnHand;
	String productName;
	public ProductApp() {
	}
	public void startProductApp() {	
		System.out.println(" M E N U ");
		System.out.println("1. Add Product ");
		System.out.println("2. Update Product ");
		System.out.println("3. Delete Product ");
		System.out.println("9. E X I T");
		System.out.println("Enter your choice :");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1: 
					System.out.println("####Welcome to add product section####");
					System.out.println( "Enter product id :"); productId = scanner.nextInt();
					System.out.println( "Enter product name :"); productName = scanner.next();
					System.out.println( "Enter product quantity on hand :"); quantityOnHand = scanner.nextInt();
					System.out.println( "Enter product price :"); price = scanner.nextInt();
					
					Product product = new Product(productId, productName, quantityOnHand, price);
					productDAO.saveProduct(product);
					System.out.println("Product with product name : "+productName + " saved successfully");
		}
	}
}
