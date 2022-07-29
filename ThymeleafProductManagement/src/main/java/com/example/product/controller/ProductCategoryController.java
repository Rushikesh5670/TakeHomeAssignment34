package com.example.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.product.entity.Product;
import com.example.product.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductCategoryController {
	
	@Autowired
	private ProductService productService;
	
  	@GetMapping("/productList")
	public String displayProducts(Model model) {
  		List<Product> product = productService.findAll();
  		model.addAttribute("PRODUCT",product);
  		
		return "productUI/product.html";
	}
  	
  	@GetMapping("/addProduct")
  	public String productForm(Model model) {
  		model.addAttribute("PRODUCT",new Product());
  		return "productUI/productForm.html";
  	}
  	
  	@PostMapping("/save")
  	public String save(@ModelAttribute("PRODUCT") Product product) {
  		productService.save(product);
  		return "redirect:/product/productList";
  	}
  	@GetMapping("/updateForm")
	public String updateForm(@RequestParam("productId") Integer id, Model model) {
  		Product product = productService.findById(id);
		model.addAttribute("PRODUCT",product);
		return "productUI/productForm.html";
	}
	
	@GetMapping("/delete")
	public String deleteById(@RequestParam("productId") Integer id) {
		productService.deleteById(id);
		
		return "redirect:/product/productList";
	}
	
}
