package com.java8;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class VowelFrequencyCounter {
	public static void main(String[] args) {
		String input="capgemini training";
		
		Set<Character> vowels=Set.of('a', 'e', 'i', 'o', 'u');
		
Map<Character, Long> vowelFrequencies =	input.chars().mapToObj(c->(char)c).filter(vowels::contains).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(vowelFrequencies);

}
}