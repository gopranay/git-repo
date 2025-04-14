import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MakingListImmutable {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Apple","Banana","Orange");
		List<String> list1=Collections.unmodifiableList(list);
		
		
		System.out.println("Other way of making list Immutable:");
		List<String> list2=List.of("Apple","Banana","Orange");
	}

}
