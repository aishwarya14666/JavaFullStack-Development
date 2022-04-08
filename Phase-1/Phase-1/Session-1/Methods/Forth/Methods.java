package Forth;

public class Methods {
	//Method overloading
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public float add(float a,float b) {
		return a+b;
	}
	public double add(double a,double b) {
		return a+b;
	}
		public static void main(String[] args) {
		Methods m=new Methods();
	    System.out.println("additin of two int="+m.add(10, 20));
	    System.out.println("addition of three int="+m.add(10, 20,30));
		System.out.println("addition of two float="+m.add(1.2f,4.5f));
		System.out.println("addition of two double="+m.add(2d, 4d));
}
}
