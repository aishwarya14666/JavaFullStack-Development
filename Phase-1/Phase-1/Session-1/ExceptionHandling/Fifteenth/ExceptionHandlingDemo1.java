package Fifteenth;

public class ExceptionHandlingDemo1 {
	public static void main(String[] args) {
		int sum=0;
		try {
		for(int i=0;i<args.length;i++) {
			sum=sum+Integer.parseInt(args[i]);
		}
		}
		catch(Exception e) {
			System.out.println("Error occured"+e);
		}
			System.out.println("Sum="+sum);
		}
}
