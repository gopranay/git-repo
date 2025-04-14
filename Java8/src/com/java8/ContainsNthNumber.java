package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContainsNthNumber {
	public static void main(String[] args) {
		List<Integer>number8=Arrays.asList(11,38,56,289,93,2,78);
		number8.stream().filter(n->n.toString().contains("8")).collect(Collectors.toList()).forEach(System.out::println);
	}

}
