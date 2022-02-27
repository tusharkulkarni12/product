package com.programming.techie.productservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.programming.techie.productservice.model.Product;
import com.programming.techie.service.ProductService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {

	private final ProductService productService;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Product> fetchAllProducts() {
		return productService.getAllProducts();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createProduct(@RequestBody Product product) {
		productService.insertProduct(product);
	}
//    
//    @DeleteMapping
//    @ResponseStatus(HttpStatus.OK)
//    public void deleteProduct(@PathVariable String id) {
//        productRepository.deleteById(id);
//    }

}
