import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContainsNthelement {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,34,567,753,5565,32,667,23,56);
		list.stream().filter(n->n.toString().contains("5")).collect(Collectors.toList()).forEach(System.out::println);
	}
}
