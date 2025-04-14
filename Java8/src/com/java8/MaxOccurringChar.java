package com.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxOccurringChar {
	public static void main(String[] args) {
		String str="test string";
	Character maxChar =	str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
	System.out.println(maxChar);
	}

}
