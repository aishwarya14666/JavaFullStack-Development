package Fifteenth;

public class MultipleCatch {
	public static void main(String[] args) {
	
	try
	{
		int c=10/0;
		System.out.println("Arithmetic exception"+c);
		
		int a[]= {0,1,2,3,4};
		System.out.println("Accessing element"+a[5]);
		
		String name=null;
		name.equals("User");
		
		Thread.sleep(1000);
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("Arithmetic exception occured"+e.getMessage());
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("IndexOutOfBond exception"+e.getMessage());
	}
	catch(NullPointerException e)
	{
		System.out.println("NullPointerException occured"+e.getMessage());
	}
	catch(InterruptedException e)
	{
		System.out.println("InterruptedException occured"+e.getMessage());
	}
	catch(Exception e)
	{
		System.out.println("error occured"+e.getMessage());
	}
}

}
