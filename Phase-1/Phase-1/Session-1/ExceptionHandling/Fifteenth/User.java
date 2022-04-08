package Fifteenth;

public class User
{
	
	static void check(int age) throws AgeNotValidException
	{
		
		if(age>18)
			throw new AgeNotValidException("elligible for voting");
		else
			throw new AgeNotValidException("not elligible");
}
	
	public static void main(String[] args) {
		try
		{
			check(35);
		}
		catch(AgeNotValidException e)
		{
			System.out.println(e);
		}
	}
}
