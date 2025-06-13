package com.products.dto;

import lombok.Data;

@Data
public class ProductRequestDTO {
	
	private String name;
	private String description;
	private Double price;
	private Integer stock;

}
