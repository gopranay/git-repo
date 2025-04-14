import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfChar {
	public static void main(String[] args) {
		String str="fhjFDJDFJG";
		str.chars().mapToObj(c->(char)c).map(c->c.toLowerCase(c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((k,v)-> System.out.println(k+":"+v));

	}

}
