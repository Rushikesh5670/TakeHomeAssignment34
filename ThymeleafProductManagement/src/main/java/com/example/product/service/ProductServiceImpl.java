package com.example.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository repository;
	
	public List<Product> findAll(){
		
		return repository.findAll();
	}
	

	public void save(Product p) {
		repository.save(p);
	}
    
    public Product findById(Integer id) {
		
		Optional<Product> p =  repository.findById(id) ;
		Product product = null;
		
		if(p.isPresent())
			product = p.get();
		
		return product;
	}

	public void deleteById(Integer id) {
		repository.deleteById(id);
		
	}


	@Override
	public List<Product> findByCategoryId(Integer category_id) {
		List<Product> results = null;
		
		if(category_id != 0 && category_id > 0) {
			results = repository.findByCategoryId(category_id);
		}
		else {
			results = findAll();
		}
		return results;
	}

}
