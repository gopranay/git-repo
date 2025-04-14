
public class ReverseString {
	public static void main(String[] args) {
		String s="Pranay"; String rstr="";
		System.out.println("reverse string using forloop");
		for (int i=s.length()-1; i>=0;i-- ) {
			rstr +=s.charAt(i);
		}
		System.out.println(rstr);
		System.out.println("Reverse string using StringBuffer");
		StringBuffer sb=new StringBuffer();
		sb.append("Pranay");
		sb.reverse();
		System.out.println(sb);
		
		System.out.println("Reverse String using streams");
	String reverse=	s.chars().mapToObj(c->String.valueOf((char)c)).reduce((a,b)-> b+a).orElse("");
		System.out.println(reverse);
	}

}
