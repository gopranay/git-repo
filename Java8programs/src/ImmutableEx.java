
public final class ImmutableEx {
	private int id;
	private String name;
	public ImmutableEx(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		ImmutableEx obj=new ImmutableEx(1, "pranay");
		System.out.println(obj.getId()+","+obj.getName());
	}
	
	

}
