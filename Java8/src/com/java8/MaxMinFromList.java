package com.java8;

import java.util.Arrays;
import java.util.List;

public class MaxMinFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> maxMin=Arrays.asList(10, 20, 30, 40);
		maxMin.stream().max(Integer::compareTo).ifPresent(max->System.out.println("Max value from List:"+ max));
		maxMin.stream().min(Integer::compareTo).ifPresent(min->System.out.println("Max value from List:"+min));
		

	}

}
