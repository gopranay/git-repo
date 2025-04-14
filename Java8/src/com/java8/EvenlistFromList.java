package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenlistFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(1, 2, 3, 4, 5, 6);
	numbers.stream().filter(n->n%2==0).forEach(System.out::println);

	}

}
