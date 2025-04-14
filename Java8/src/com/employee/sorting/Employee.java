package com.employee.sorting;

public class Employee {
	int id;
	String name;
	Double salary;
	public Employee(int id, String name, int sal) {
	
		this.id = id;
		this.name = name;
		this.salary = (double) sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
