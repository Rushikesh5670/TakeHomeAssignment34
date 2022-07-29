package com.example.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.entity.Category;
import com.example.product.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryRepository repository;
	
	public List<Category> findAll(){
		
		return repository.findAll();
	}
	

	public void save(Category c) {
		repository.save(c);
	}
    
    public Category findById(Integer id) {
		
		Optional<Category> p =  repository.findById(id) ;
		Category category = null;
		
		if(p.isPresent())
			category = p.get();
		
		return category;
	}

	public void deleteById(Integer id) {
		repository.deleteById(id);
		
	}

}
