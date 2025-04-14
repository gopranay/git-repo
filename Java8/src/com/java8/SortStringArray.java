package com.java8;

import java.util.Arrays;

public class SortStringArray {
	public static void main(String[] args) {
		String[] word= {"Banana", "Apple", "Grapes", "Mango", "Cherry"};
	String[] sortedArray=Arrays.stream(word).sorted().toArray(String[]::new);
	System.out.println(Arrays.toString(sortedArray));
	}
}
