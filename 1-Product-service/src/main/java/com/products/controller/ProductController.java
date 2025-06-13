package com.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.dto.ProductRequestDTO;
import com.products.dto.ProductResponseDTO;
import com.products.dto.ProductStockUpdates;
import com.products.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/products")
@Slf4j
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping
	public ResponseEntity<ProductResponseDTO> addProduct(@RequestBody ProductRequestDTO request) {
		log.info("ProductController addProduct");
		return new ResponseEntity<>(productService.addProduct(request), HttpStatus.CREATED);
		
	}
	@GetMapping("/{productId}")
	public ResponseEntity<ProductResponseDTO> getProduct(@PathVariable Long productId){
		log.info("ProductController getProduct");
		return ResponseEntity.ok(productService.getProduct(productId));
		
	}

	@GetMapping
	public List<ProductResponseDTO> getAllProducts(){
		log.info("ProductController getAllProducts");
		return productService.getAllProducts();
		
	}
	@GetMapping("/exists/{productId}")
	public boolean isProductExists(@PathVariable Long productId) {
		return productService.isProductExist(productId);
		
	}
	@PutMapping("/update-stock")
	public void updateProductStock(@RequestBody List<ProductStockUpdates> request) {
		log.info("product controller updatectock");
		productService.updateStock(request);
	}
	
}
