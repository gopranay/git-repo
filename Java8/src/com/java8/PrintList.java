package com.java8;

import java.util.Arrays;
import java.util.List;

public class PrintList {

	public static void main(String[] args) {
		List list=Arrays.asList("Alice", "Bob", "Charlie");
		list.stream().forEach(names -> System.out.println(names));
		
	}

}
