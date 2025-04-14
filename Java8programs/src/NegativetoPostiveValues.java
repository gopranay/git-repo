import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NegativetoPostiveValues {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(-1,2,-4,5,-6,3,-7,8);
		List<Integer>negative=list.stream().filter(n->n<0).collect(Collectors.toList());
		List<Integer> positive=list.stream().filter(n->n>0).collect(Collectors.toList());
		negative.addAll(positive);
		System.out.println(negative);
	}

}
