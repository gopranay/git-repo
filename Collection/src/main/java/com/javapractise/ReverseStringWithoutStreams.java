package com.javapractise;

public class ReverseStringWithoutStreams {
	public static void main(String[] args) {
		String s1="pranay", rstr="";
		
		
		for (int i=s1.length()-1; i>=0; i--) {
			rstr +=s1.charAt(i);
		}
		System.out.println(rstr);
		
	}

}
