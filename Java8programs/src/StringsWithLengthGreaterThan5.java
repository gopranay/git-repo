import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsWithLengthGreaterThan5 {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "pear", "watermelon", "orange", "kiwi");
		List<String>ls=strings.stream().filter(n->n.length()>5).collect(Collectors.toList());
		System.out.println(ls);
	}

}
