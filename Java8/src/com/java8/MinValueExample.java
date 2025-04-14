package com.java8;

import java.util.Arrays;
import java.util.List;

public class MinValueExample {
	public static void main(String[] args) {
		List<Integer> minList=Arrays.asList(15, 8, 20, 5, 12);
		int min=minList.stream().min(Integer::compareTo).orElse(null);
		System.out.println(min);
	}

}
