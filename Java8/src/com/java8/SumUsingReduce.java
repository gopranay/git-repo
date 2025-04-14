package com.java8;

import java.util.Arrays;
import java.util.List;

public class SumUsingReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(10, 20, 30, 40, 50);
		int sumof=numbers.stream().reduce(0,Integer::sum);
		System.out.println(sumof);

	}

}
