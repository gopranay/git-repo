package com.java8;

import java.util.stream.IntStream;

public class FactorialUsingStreams {
	public static void main(String[] args) {
	//	int number=5;
		int factrialNum=IntStream.rangeClosed(1, 5).reduce(1, (a,b)->a*b);
		System.out.println(factrialNum);
	}

}
