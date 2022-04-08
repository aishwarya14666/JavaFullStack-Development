package Fifteenth;

public class ExceptionHandlingDemo4 {
	
	static void waitFor()
	{
		try
		{
		Thread.sleep(1000);
		System.out.println("Hello");
	}
		catch(InterruptedException e)
		{
			System.out.println("Error"+e);
		}
	}
	public static void main(String[] args) {
		waitFor();
	}

}
