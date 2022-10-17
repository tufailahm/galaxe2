package com.training.galaxe.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.galaxe.config.HibernateUtil;
import com.training.galaxe.model.Product;

public class ProductDAOImpl implements ProductDAO{
	public ProductDAOImpl() {	
	}
	@Override
	public void saveProduct(Product product) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(product);
		transaction.commit();
		
		session.close();
		sessionFactory.close();
		
	}

	@Override
	public void updateProduct(Product product) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.update(product);
		transaction.commit();
		
		session.close();
		sessionFactory.close();
		
	}

	@Override
	public void deleteProduct(int productId) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Product product = new Product();
		product.setProductId(productId);
		session.delete(product);
		transaction.commit();
		
		session.close();
		sessionFactory.close();
		
	}

	@Override
	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> searchProduct(String productName) {
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
