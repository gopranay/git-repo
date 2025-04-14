package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeLists {
	public static void main(String[] args) {
		List<String> list1=Arrays.asList("apple", "banana", "cherry");
		List<String> list2=Arrays.asList("date", "fig", "grape");
		
		List<String> mergedList=Stream.of(list1,list2).flatMap(List::stream).collect(Collectors.toList());
		System.out.println(mergedList);
	}

}
