package com.java8;

import java.util.Arrays;
import java.util.List;

public class AllElementsCheck {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(10,20,30,40,50);
	Boolean greaterCheck=	numbers.stream().allMatch(n->n>5);
	System.out.println(greaterCheck);
	}

}
