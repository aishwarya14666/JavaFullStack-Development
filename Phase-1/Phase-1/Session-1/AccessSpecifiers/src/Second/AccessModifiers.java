package Second;

public class AccessModifiers {
	
	public int add(int a,int b) {
		int result=a+b;
		System.out.println("Public Method");
		return result;
	}
	private int sub(int a,int b) {
		int result=a-b;
		System.out.println("Private Method");
		return result;
	}
	
	int mul(int a,int b) {
		int result=a*b;
		System.out.println("Default Method");
		return result;
		
	}
	protected  int div(int a,int b) {
		int result=a/b;
		System.out.println("Protected Method");
		return result;
	}
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		AccessModifiers am=new AccessModifiers();
		
		int result1 = am.add(a,b);
		System.out.println("Addition="+result1);
		
		int result2 =am.sub(a,b);
		System.out.println("Subtaction="+result2);
		
		int result3=am.mul(a,b);
		System.out.println("Multiplication="+result3);
		
		int result4=am.div(a, b);
		System.out.println("Division="+result4);
		
		
	}

}
