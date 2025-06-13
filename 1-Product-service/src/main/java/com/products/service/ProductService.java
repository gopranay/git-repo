package com.products.service;

import java.util.List;

import com.products.dto.ProductRequestDTO;
import com.products.dto.ProductResponseDTO;
import com.products.dto.ProductStockUpdates;

public interface ProductService {
	
	ProductResponseDTO addProduct(ProductRequestDTO request);
		
	ProductResponseDTO getProduct(Long productId);
	boolean isProductExist(Long productId);
	List<ProductResponseDTO> getAllProducts();
	void updateStock(List<ProductStockUpdates> updates) ;
		
	

}
