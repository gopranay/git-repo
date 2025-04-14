package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringToUpper_Lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings=Arrays.asList("AlIce","Bob");
	List<String> upper=	strings.stream().map(String::toUpperCase).collect(Collectors.toList());
	System.out.println(upper);
	List<String> lower=strings.stream().map(String::toLowerCase).collect(Collectors.toList());
	System.out.println(lower);
	
	}

}
