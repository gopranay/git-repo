package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		List original=numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(original);
	}

}
