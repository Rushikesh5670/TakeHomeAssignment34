package com.example.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.product.entity.Category;

@Service
public interface CategoryService {
	
	public List<Category> findAll();

	public void save(Category c);
	
	public Category findById(Integer id);
	
	public void deleteById(Integer id);

}
