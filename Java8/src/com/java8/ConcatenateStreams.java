package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateStreams {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Apple", "Banana", "Cherry");
        List<String> list2 = Arrays.asList("Date", "Fig", "Grape");
        List<String> concatString=Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        System.out.println(concatString);
	}

}
