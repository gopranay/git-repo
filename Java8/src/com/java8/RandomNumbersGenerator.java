package com.java8;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomNumbersGenerator {
	public static void main(String[] args) {
		Random random=new Random();
	List<Integer> randomnumbers=	Stream.generate(()->random.nextInt(100)).limit(10).collect(Collectors.toList());
	System.out.println(randomnumbers);
	}

}
