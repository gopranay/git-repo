import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MultiplemaxminOfList {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(45,12,56,15,24,75,31,89);
		
		list.stream().filter(n->n%5==0).forEach(System.out::println);
		System.out.println("----------------------------");
		
			int max=list.stream().max(Comparator.naturalOrder()).get();
			System.out.println(max);
			int min=list.stream().min(Comparator.naturalOrder()).get();
			System.out.println(min);
		
	}

}
