package com.programming.techie.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.programming.techie.productservice.model.Product;
import com.programming.techie.productservice.repository.ProductRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProductService {
	
	private final ProductRepository productRepository;

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	public void insertProduct(Product product) {
		// TODO Auto-generated method stub
		
		productRepository.save(product);
	}
	
	
	

}
