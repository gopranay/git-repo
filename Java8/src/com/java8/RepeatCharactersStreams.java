package com.java8;

import java.util.stream.Collectors;

public class RepeatCharactersStreams {
	public static void main(String[] args) {
		String input="welcome";
	String output=input.chars().mapToObj(c->""+(char)c+(char)c).collect(Collectors.joining());
	System.out.println(output);
	}

}
