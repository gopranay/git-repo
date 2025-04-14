package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Anna");
	List NaturalOrdernames=	names.stream().sorted().collect(Collectors.toList());
	System.out.println(NaturalOrdernames);
	System.out.println("--------------------------------------------------");
	List reverseOrdernames=names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(reverseOrdernames);
		}

}
