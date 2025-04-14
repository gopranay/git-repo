package com.employee.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployees {
	String name;
	String department;
	public GroupEmployees(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	@Override
	public String toString() {
		return "GroupEmployees [name=" + name + ", department=" + department + "]";
	}
	public static void main(String[] args) {
		List<GroupEmployees> emp=Arrays.asList(new GroupEmployees("Alice", "IT"),
	            new GroupEmployees("Bob", "HR"),
	            new GroupEmployees("Charlie", "IT"),
	            new GroupEmployees("David", "Finance"),
	            new GroupEmployees("Eve", "HR"));
	Map<String,List<GroupEmployees>> departmentemp=	emp.stream().collect(Collectors.groupingBy(emps->emps.department));
	departmentemp.forEach((e1,e2)->System.out.println(e1+":"+e2));
	}

}
