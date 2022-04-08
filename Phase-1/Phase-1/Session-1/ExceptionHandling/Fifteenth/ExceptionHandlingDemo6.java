package Fifteenth;

public class ExceptionHandlingDemo6 {
	//throw exception by own
	//we can use throw keyword
	static void check(int age) {
		//throwing unchecked exception
		if(age<18)
		{
			throw new ArithmeticException("Not valid for voting");
		}
		else
		{
			throw new ArithmeticException("Valid for voting");
		}
	}
	public static void main(String[] args) {
		check(23);
	}

}
