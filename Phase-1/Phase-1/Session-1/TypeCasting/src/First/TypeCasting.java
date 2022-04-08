package First;

public class TypeCasting {
	public static void main(String[] args) {
		System.out.println("Implicit type casting");
		char a='A';
		System.out.println("Value of c:"+a);
		int b=a;
		System.out.println("Value of b:"+b);
		float f=b;
		System.out.println("Value of d:"+f);
		double e=f;
		System.out.println("Value of e:"+e);
		System.out.println("Explicit type casting");
		String s="100";
		int n=Integer.parseInt(s);
		System.out.println("string to integer="+n);
		double d=45d;
		int i=(int)d;
		System.out.println("double to int="+i);
	}

}
