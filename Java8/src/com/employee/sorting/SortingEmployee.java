package com.employee.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortingEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp = Arrays.asList(new Employee(1, "Alice", 50000), new Employee(2, "Bob", 70000),
				new Employee(3, "Charlie", 60000));
		Optional<Employee> hsalary = emp.stream().max(Comparator.comparingDouble(e -> e.salary));
		hsalary.ifPresent(sa -> System.out.println("Highest salary" + sa));
		System.out.println("--------------------------------------------------");
		System.out.println("Sorting Employees in Ascending Order (Lowest to Highest Salary)");
		emp.stream().sorted((e1,e2)->Double.compare(e1.salary, e2.salary)).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("----------------------------------------------------");
		System.out.println("Sorting Employees in Descending Order (Highest to Lowest Salary)");
		emp.stream().sorted((e1,e2)->Double.compare(e2.salary, e1.salary)).collect(Collectors.toList()).forEach(System.out::println);

	}

}
