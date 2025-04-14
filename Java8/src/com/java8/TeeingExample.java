package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TeeingExample {
	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		 Object result	= numbers.stream().collect(Collectors.teeing(Collectors.summingInt(Integer::intValue), Collectors.averagingInt(Integer::intValue), 
				 (sum,avg)->Map.of("Sum",sum,"Avg",avg)));
		 System.out.println(result);
		
	}

}
