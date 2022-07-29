package com.example.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.product.entity.Product;

@Service
public interface ProductService {
	
	public List<Product> findAll();

	public void save(Product p);
	
	public Product findById(Integer id);
	
	public void deleteById(Integer id);

}
