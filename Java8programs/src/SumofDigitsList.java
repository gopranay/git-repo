import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SumofDigitsList {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,34,56,676,32,34,67,44);
	int max=list.stream().distinct().reduce((a,b)->a+b).get();
	System.out.println(max);
	System.out.println("2nd Highest");
	int Second=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	System.out.println(Second);
	
	}

}
