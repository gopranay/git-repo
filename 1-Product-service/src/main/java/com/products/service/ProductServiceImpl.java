package com.products.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.dto.ProductRequestDTO;
import com.products.dto.ProductResponseDTO;
import com.products.dto.ProductStockUpdates;
import com.products.models.Product;
import com.products.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public ProductResponseDTO addProduct(ProductRequestDTO request) {
		// TODO Auto-generated method stub
		
		Product product=new Product();
		product.setName(request.getName());
		product.setPrice(request.getPrice());
		product.setDescription(request.getDescription());
		product.setStock(request.getStock());
		
		Product dbproduct=productRepository.save(product);
		return mapToDTO(dbproduct);
	}

	private ProductResponseDTO mapToDTO(Product dbproduct) {
		// TODO Auto-generated method stub
		ProductResponseDTO dto=new ProductResponseDTO();
		BeanUtils.copyProperties(dbproduct, dto);
		return dto;
	}

	@Override
	public ProductResponseDTO getProduct(Long productId) {
		// TODO Auto-generated method stub
		return productRepository.findById(productId).map(product->mapToDTO(product)).orElseThrow(()->new RuntimeException("Product Not Found"));
	}

	@Override
	public boolean isProductExist(Long productId) {
		// TODO Auto-generated method stub
		return productRepository.existsById(productId);
	}

	@Override
	public List<ProductResponseDTO> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll().stream().map(this::mapToDTO).toList();
	}

	@Override
	public void updateStock(List<ProductStockUpdates> updates) {
		// TODO Auto-generated method stub
		for (ProductStockUpdates dto:updates) {
			Product product=productRepository.findById(dto.getProductId()).orElseThrow(()->new RuntimeException("product id not available"));
		if(product.getStock()<dto.getQuantity()) {
			throw new RuntimeException("Insuffient stock for product");
		}
		product.setStock(product.getStock() - dto.getQuantity());
		productRepository.save(product);
		}
	}

}
