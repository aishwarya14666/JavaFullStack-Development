package Eight;

public class StringDemo {
	public static void main(String[] args) {
		
	String s= new String("Hello World");
	String s1=new String("Welcome World");
	String s3= new String("hello world");
	
	
	System.out.println("Length of string="+s.length());
	System.out.println("String at index 4="+s.charAt(4));
	System.out.println("String in upper case="+s.toUpperCase());
	System.out.println("String in lower case="+s.toLowerCase());
	System.out.println("To check if string contains:"+s.contains("Hello"));
	System.out.println("Sub String="+s.substring(4));
	System.out.println("Sub String="+s.substring(2, 6));
	if(s.contentEquals(s1))
		System.out.println("s=s1");
	else
			System.out.println("s!=s1");
	
	if(s.equalsIgnoreCase(s3))
		System.out.println("Validated");
	else
		System.out.println("Not validated");
	
	
	
	}
}
