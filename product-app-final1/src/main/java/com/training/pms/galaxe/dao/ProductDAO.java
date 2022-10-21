package com.training.pms.galaxe.dao;

import org.springframework.data.repository.CrudRepository;

import com.training.pms.galaxe.model.Product;

public interface ProductDAO extends CrudRepository<Product, Integer>{

}
