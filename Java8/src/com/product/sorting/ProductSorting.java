package com.product.sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProductSorting {
	public static void main(String[] args) {
		List<Product> products=Arrays.asList(
				new Product(101,"Laptop", 500000.0),
				new Product(103,"Mobile",57437543.0),
				new Product(102,"Car",543653254.0),
				new Product(104,"Bike",500748743000.0));
		
		Collections.sort(products);
		System.out.println("Sorted by ID (Comparable):");
		products.forEach(System.out::println);
		System.out.println("--------------------------------");
		// Sorting by Name (Comparator)
		products.sort(new productName_Sorting());
		products.forEach(System.out::println);
	}

}
