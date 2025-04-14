package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestNumber {
public static void main(String[] args) {
	List<Integer> salary=Arrays.asList(10, 20, 30, 40, 50);
	int secoondHighest=salary.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
	System.out.println(secoondHighest);
}
}
