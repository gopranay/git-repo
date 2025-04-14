
public class SingletonDesign {
	private static SingletonDesign singleton=null;
	
	private SingletonDesign() {
		
	}
	public static SingletonDesign getInstace() {
		if(singleton==null) {
			singleton= new SingletonDesign();
		}
		return singleton;
		
		
	}
	void msg() {
		System.out.println("Hello Sington");
		
	}
	public static void main(String[] args) {
		SingletonDesign sd=SingletonDesign.getInstace();
		sd.msg();
	}

}
