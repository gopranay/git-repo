package com.java8;

import java.util.stream.Stream;

public class InfiniteEvenStream {
	public static void main(String[] args) {
		Stream.iterate(2, n->n+2).limit(10).forEach(System.out::println);
		
	}

}
