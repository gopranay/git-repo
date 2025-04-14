import java.util.function.Function;

class LambdaTest {

	public static void main(String[] args) {
		Function<String, Integer> f=s ->s.length();
		System.out.println(f.apply("Pranay"));
		
	
	}

}
