package com.javapractise;

public class ReverseStringUsingStreams {
	public static void main(String[] args) {
		String s2="gonepranay";
		String reversestring=s2.chars().mapToObj(c -> String.valueOf((char)c)).reduce((a,b) -> b+a).orElse("");
		System.out.println(reversestring);
	}

}


/*s2.chars(): This converts the string s2 into an IntStream of Unicode code points (essentially an IntStream where each element represents a character in the string).

.mapToObj(c -> String.valueOf((char)c)): This maps each integer code point to its corresponding char and then converts it to a String. This step transforms the IntStream into a Stream<String>, where each string is a single character.

.reduce((a, b) -> b + a): This reduces the Stream<String> to a single string by concatenating the characters in reverse order. The reduce function takes two parameters:

a is the accumulated result so far.
b is the current string element from the stream. The lambda function b + a reverses the order of concatenation, thus building the reversed string.
.orElse(""): This provides a default value of an empty string if the stream is empty (which happens if s2 is an empty string).*/