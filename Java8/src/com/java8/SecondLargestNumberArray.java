package com.java8;

import java.util.Arrays;
import java.util.Optional;

public class SecondLargestNumberArray {
	public static void main(String[] args) {
		int[] numbers = {2, 3, 5, 6, 1, 0};
	Integer secondMax=Arrays.stream(numbers).boxed().sorted((a,b)->b-a).skip(1).findFirst().orElse(null);
	System.out.println(secondMax);
	}

}
