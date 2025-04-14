import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramChck {
	public static void main(String[] args) {
		
		String s1="gum";
		String s2="mug";
		
		s1=Stream.of(s1.split("")).map(c-> c.toLowerCase()).sorted().collect(Collectors.joining());
		s2=Stream.of(s2.split("")).map(c2-> c2.toLowerCase()).sorted().collect(Collectors.joining());
		
		if(s1.equals(s2)) {
			System.out.println("It is Anagram");
		}else {
			System.out.println("It is not Anagram");
		}
	}

}
