package com.example.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.product.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	public List<Product> findByCategoryId(Integer category_id);

}
