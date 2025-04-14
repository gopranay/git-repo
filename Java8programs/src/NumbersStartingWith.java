import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingWith {
	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(10, 15, 25, 1, 123, 100, 34, 145, 200);
	List<Integer> num= numbers.stream().filter(n->n.toString().startsWith("1")).collect(Collectors.toList());
	System.out.println(num);
	
	
		 
	}

}
