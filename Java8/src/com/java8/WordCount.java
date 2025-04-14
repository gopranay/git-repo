package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings=Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
	Map<String, Long>	stringcount=strings.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
	System.out.println(stringcount);
		

	}

}
