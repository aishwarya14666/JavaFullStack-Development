package Seventh;

public class LocalInnerClass {
public void display() {
	class Inner {
		int a=10;
		int b=30;
		public void add() {
System.out.println("Addition="+(a+b));
}
	}
Inner inner=new Inner();
inner.add();
}
public static void main(String[] args) {
	LocalInnerClass local=new LocalInnerClass();
	local.display();
}
}
