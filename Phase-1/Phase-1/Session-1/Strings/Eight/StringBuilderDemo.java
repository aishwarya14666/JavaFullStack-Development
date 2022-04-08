package Eight;

public class StringBuilderDemo {
	public static void main(String[] args) {
		String s=new String("Welcome to the World");
		StringBuilder s1=new StringBuilder(s);
		
		System.out.println("String Lenghth="+s1.length());
		System.out.println("Append string="+s1.append("------"));
		System.out.println("Insert:"+s1.insert(18, " "));
		System.out.println("Replace:"+s1.replace(11, 14, "JAVA"));
		System.out.println("Reverse the string:"+s1.reverse());
		
	}

}
