import java.util.Arrays;
import java.util.List;

public class SortingEmp {
	public static void main(String[] args) {
		List<Employee> emp=Arrays.asList(new Employee (1,"Pranay",54756, "HR"),
				new Employee (2,"gone",5748775,"dev"),new Employee (2,"gone",7643,"HR"),new Employee (3,"swetha",97765,"HR"),new Employee (2,"sambary",95485,"dev"));
		
		emp.stream().filter(e->"HR".equalsIgnoreCase(e.getDepartment())).map(Employee:: getName).forEach(System.out::println);
	
	}

}
