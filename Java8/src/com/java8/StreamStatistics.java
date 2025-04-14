package com.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamStatistics {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
	IntSummaryStatistics stats=numbers.stream().mapToInt(Integer::intValue).summaryStatistics();
	System.out.println(stats.getAverage());
	System.out.println(stats.getCount());
	System.out.println(stats.getMax());
	System.out.println(stats.getMin());
	System.out.println(stats.getSum());
	
	}

}
