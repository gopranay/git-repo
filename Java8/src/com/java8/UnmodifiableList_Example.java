package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList_Example {
	public static void main(String[] args) {
		List<String> modifiable=Arrays.asList("Banana","Apple","Grapes");
		System.out.println(modifiable);
		System.out.println("---------------------------");
		List<String> unmodifiable=Collections.unmodifiableList(modifiable);
		modifiable.add("Mango");
		System.out.println(modifiable);
		List<String> immutable=List.of("Apple", "Banana", "Cherry");
	}

}
