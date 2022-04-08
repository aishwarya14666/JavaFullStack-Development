package Fifteenth;

public class ExceptionHandlingDemo5 {
	//throwing checked exception
	static void check(int age) throws Exception 
	{ 
		if(age>18)
			throw new Exception("Valid for Voting");
		else
			System.out.println("Not valid for voting");
	}
	static void test() throws Exception
	{
		check(24);
	}
	public static void main(String[] args) {
		try 
		{
		test();
	}
		catch(Exception e) {
			e.printStackTrace();
			//handled using try catch
		}

}
}
