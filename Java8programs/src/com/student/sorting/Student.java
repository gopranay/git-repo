package com.student.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
	private int id;
	private String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(1,"Pranay"));
		al.add(new Student(7,"gone"));
		al.add(new Student(3,"swetha"));
		al.add(new Student(2,"sambari"));
		al.add(new Student(5,"sagar"));
		al.add(new Student(4,"GP"));
		al.add(new Student(6,"PS"));
		System.out.println("Sorting by id");
		Collections.sort(al, new IdSorting());
		System.out.println(al);
		System.out.println("Sorting by Name");
		Collections.sort(al, new NameSorting());
		System.out.println(al);
	}


}
