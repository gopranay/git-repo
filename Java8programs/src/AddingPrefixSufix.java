import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AddingPrefixSufix {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("pranay","gone","swetha");
	String  jpinstring=list.stream().collect(Collectors.joining(",","{","}"));
		System.out.println(jpinstring);
	}

}
