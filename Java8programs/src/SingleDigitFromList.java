import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SingleDigitFromList {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,34,53,5,86,754,786,2,6,8,2,7,44);
	List<Integer> s=list.stream().filter(n->Math.abs(n)<10).collect(Collectors.toList());
	System.out.println(s);
}
}
