package com.java8;

import java.util.Arrays;
import java.util.List;

public class AverageCalculation {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		Double avg=numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
		System.out.println(avg);
	}

}
