package com.java8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="SwethaPranay";
	Character nonre=	input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()==1).map(entry->entry.getKey()).findFirst().orElse(null);
		System.out.println(nonre);
	
	}

}
