package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfDistinctNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
	List squareroot=numbers.stream().distinct().map(n->n*n).collect(Collectors.toList());
	System.out.println(squareroot);
	}

}
