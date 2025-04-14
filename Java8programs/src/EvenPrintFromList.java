import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenPrintFromList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 25, 1, 123, 100, 34, 145, 200);
		List<Integer> even=list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		
	}

}
