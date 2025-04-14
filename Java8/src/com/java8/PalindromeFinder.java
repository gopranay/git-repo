package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeFinder {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("level", "hello", "radar", "world", "madam", "java");
	List pallindram=words.stream().filter(n->n.equals(new StringBuilder(n).reverse().toString())).collect(Collectors.toList());
	System.out.println(pallindram);
	}

}
