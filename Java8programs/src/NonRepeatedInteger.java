import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedInteger {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,9,3,2,1,3,4,5,6,6,5,5,3,3);
		
		long result=list.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(e->e.getValue()==1).map(entry->entry.getKey()).skip(0)
				.findFirst().get();
		System.out.println(result);
	}

}
