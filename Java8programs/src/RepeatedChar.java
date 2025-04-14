import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedChar {
	public static void main(String[] args) {
		String str="Iam an Indian";
		str.chars().mapToObj(c->(char)c).map(c->c.toLowerCase(c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()>1)

		.forEach(e->System.out.println(e.getKey()+":"+e.getValue()));
	}

}
