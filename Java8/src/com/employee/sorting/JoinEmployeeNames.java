package com.employee.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinEmployeeNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empnames=Arrays.asList( new Employee(1,"Alice",4543),
                new Employee(2, "Bob", 465437),
                new Employee(3,"Charlie",3434)
        );
	String names=	empnames.stream().map(emp->emp.name).collect(Collectors.joining(" |"));
	System.out.println(names);

	}

}
