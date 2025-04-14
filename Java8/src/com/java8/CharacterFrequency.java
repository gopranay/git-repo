package com.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
public static void main(String[] args) {
	String str="java";
	Map<Character, Long>charcount=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	System.out.println(charcount);
}
}
