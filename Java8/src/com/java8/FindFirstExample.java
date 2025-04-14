package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExample {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5, 8, 12, 15, 20);
	int number=	list.stream().filter(n->n>10).findFirst().orElse(null);
	System.out.println(number);
	}

}
