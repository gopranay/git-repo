package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1, 2, 3, 4, 5, 2, 6, 3, 7, 8, 1);
		System.out.println("One Way");
	numbers.stream().filter(n->Collections.frequency(numbers, n)>1).collect(Collectors.toSet()).forEach(System.out::println);
	System.out.println("----------------------------------------------------");
	System.out.println("Other way of doing");
	 numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
	 .stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet()).forEach(System.out::println);
	}

}
