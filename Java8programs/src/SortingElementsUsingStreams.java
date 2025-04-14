import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortingElementsUsingStreams {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,34,57,64,77,32,54,89,43,24);
		System.out.println("Ascending order");
		list.stream().sorted().forEach(e->System.out.println(e));
		System.out.println("Descending order");
		list.stream().sorted((e1,e2)->e2.compareTo(e1)).forEach(System.out::println);
		System.out.println("Descending order in other way of style");
		list.stream().sorted((e1,e2)-> -e1.compareTo(e2)).forEach(System.out::println);
		
		System.out.println("save sorted list in other list");
		List<Integer> reser=list.stream().sorted((e,e1)->e1.compareTo(e)).collect(Collectors.toList());
		reser.forEach(ele->System.out.println(ele));
	}
	
	

}
