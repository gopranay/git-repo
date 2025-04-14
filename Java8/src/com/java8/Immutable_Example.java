package com.java8;

final class Immutable_Example {
	private final int id;
	private final String name;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Immutable_Example(int id, String name) {
		this.id=id;
		this.name=name;
	}
public static void main(String[] args) {
	Immutable_Example obj=new Immutable_Example(101,"Pranay");
	System.out.println(obj.id +":"+obj.name);
	
} }
