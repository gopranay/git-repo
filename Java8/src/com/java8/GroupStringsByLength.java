package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> groupofStrings = Arrays.asList("apple", "banana", "cherry", "kiwi", "grape", "mango");
		Map<Integer, List<String>>stringgroup=groupofStrings.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(stringgroup);
		

	}

}
