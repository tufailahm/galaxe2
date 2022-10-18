package com.training.galaxe.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.training.galaxe.config.HibernateUtil;
import com.training.galaxe.model.Product;

public class ProductDAOImpl implements ProductDAO {
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
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Product product = new Product();
		product.setPrice(11800);												//11800
		System.out.println("PRODUCT price at line : 69 "+product.getPrice());		//11800

		product = session.get(Product.class, productId);			//2300 - productId
		System.out.println("PRODUCT price at line : 71 "+product.getPrice());		//100
		//change the product here 
		product.setPrice(10800);
		System.out.println("PRODUCT price at line : 75 "+product.getPrice());		//10800

		product.setProductName("BLR");
		
		transaction.commit();
		session.close();
		sessionFactory.close();
		product.setPrice(15800);
		System.out.println("PRODUCT price at line : 83 "+product.getPrice());		//15800


		return product;

	}

	@Override
	public List<Product> getProduct() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Query query = session.createQuery("from Product");
		List<Product> allProducts = query.list();
		session.close();
		sessionFactory.close();
		return allProducts;
	}

	@Override
	public List<Product> searchProduct(String productName) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		//by using query
		Query query = session.createQuery("from Product where productName = '"+productName+ "'");

		List<Product> allProducts = query.list();
		session.close();
		sessionFactory.close();
		return allProducts;
	}

	@Override
	public List<Product> searchProduct(int min, int max) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		//by using criteria
		Criteria criteria = session.createCriteria(Product.class);			//select * from product;
		List<Product> p1=  criteria.list();
		criteria.add(Restrictions.between("price", min, max));  //select * from product where price between 40 and 60
		
		List<Product> p2=  criteria.list();
		
		return p2;
		
	}

	@Override
	public List<Product> checkStockStatus(int minStock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isProductExists(int productId) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Product product = session.get(Product.class, productId);
		session.close();
		sessionFactory.close();

		if (product == null)
			return false;
		else
			return true;
	}

	@Override
	public List<Product> searchProduct(String productName, int price, int qoh) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Query query = session.createQuery("from Product where productName = '"+productName+ "' and price = "+price+ " and quantityONJHa");

		List<Product> allProducts = query.list();
		session.close();
		sessionFactory.close();
		return allProducts;
	}
}



