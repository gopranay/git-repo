package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringConcatenation {
	public static void main(String[] args) {
		List<String> words=Arrays.asList("Java", "Spring", "Microservices");
	String wordsjoin=	words.stream().collect(Collectors.joining(","));
	System.out.println(wordsjoin);
	System.out.println("-------------------------------------------------");
	System.out.println("Concatenating with a Prefix & Suffix");
	String wordsjoinwithprefixsuffix=	words.stream().collect(Collectors.joining(",","{","}"));
	System.out.println(wordsjoinwithprefixsuffix);
		
	}

}
