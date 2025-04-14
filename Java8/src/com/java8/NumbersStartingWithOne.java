package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingWithOne {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 23, 19, 45, 123, 1, 99);
	List numbersStartingWithOne=	numbers.stream().map(String::valueOf).filter(n->n.startsWith("1")).map(Integer::valueOf).collect(Collectors.toList());
	System.out.println(numbersStartingWithOne);
	}

}
