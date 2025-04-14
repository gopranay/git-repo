package com.javapractise;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmapEx {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> ch=new ConcurrentHashMap<>();
		ch.put(1, "Banana");
		ch.put(2, "Apple");
		ch.putIfAbsent(3, "Sapota");
		ch.putIfAbsent(4, "Mango");
		ch.replace(3, "Ayyappa");
		System.out.println(ch);
		
	}

}
