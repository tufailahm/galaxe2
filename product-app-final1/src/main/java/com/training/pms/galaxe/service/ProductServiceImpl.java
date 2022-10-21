package com.training.pms.galaxe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.pms.galaxe.dao.ProductDAO;
import com.training.pms.galaxe.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;
	
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String saveProduct(Product product) {
		
		if(product.getPrice() <0 | product.getQuantityOnHand() <0)
		{
			return "Product price or QOH cannot be negative. Not Saved";
		}
		else {
			productDAO.save(product);
			return "Product Saved Successfully";
		}

	}

	@Override
	public String updateProduct(Product product) {
		if(product.getPrice() <0 | product.getQuantityOnHand() <0)
		{
			return "Product price or QOH cannot be negative. Not Updated";
		}
		else {
			productDAO.save(product);
			return "Product Updated Successfully";
		}
	}

	@Override
	public String deleteProduct(int productId) {
		productDAO.deleteById(productId);
		return "Product deleted successfully";
	}

	@Override
	public Product getProduct(int productId) {
		Optional<Product> product= productDAO.findById(productId);
		return product.get();
	}

	@Override
	public List<Product> getProduct() {
		return (List<Product>) productDAO.findAll();
	}

	@Override
	public boolean isProductExists(int productId) {
		Optional<Product> product= productDAO.findById(productId);
		return product.isPresent();
	}

	
	//To be continued ... part -2 online
	@Override
	public List<Product> searchProduct(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> searchProduct(String productName, int price, int qoh) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> searchProduct(int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> checkStockStatus(int minStock) {
		// TODO Auto-generated method stub
		return null;
	}

}
