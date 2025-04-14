import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatinatingStreams {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream1 = list1.stream();
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
     Stream<Integer> stream2=list2.stream();
     Stream<Integer> concatstream=Stream.concat(stream1, stream2);
     List<Integer>concat=concatstream.collect(Collectors.toList());
     System.out.println(concat);
     
	}

}
