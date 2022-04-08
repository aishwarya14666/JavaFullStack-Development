package Fifteenth;


public class ExceptionHandlingDemo3 {
		
		static void divide(int a,int b) {
			int result=a/b;
			System.out.println("Result="+result);
			
	}
	public static void main(String[] args) {
		try
		{
		divide(20,0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error occured"+e);
			e.printStackTrace();
		}
	}

}
