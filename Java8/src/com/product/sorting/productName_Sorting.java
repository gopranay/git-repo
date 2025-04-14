package com.product.sorting;

import java.util.Comparator;

public class productName_Sorting implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getProductName().compareTo(o2.getProductName());
	}

}
