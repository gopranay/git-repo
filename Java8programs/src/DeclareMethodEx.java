import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DeclareMethodEx {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Test testmethod=new Test();
		try {
			Method m=Test.class.getDeclaredMethod("m1");
			m.setAccessible(true);
			m.invoke(testmethod);
			
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
class Test{
	private void m1() {
		System.out.println("Private method accessed");
	}
}