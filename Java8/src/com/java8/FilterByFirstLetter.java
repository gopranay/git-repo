package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByFirstLetter {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Anna");
		List filteredNames=names.stream().
				filter(name->name.startsWith("A")).collect(Collectors.toList());
		System.out.println(filteredNames);
	}

}
