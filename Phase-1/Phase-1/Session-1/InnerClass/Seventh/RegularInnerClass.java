package Seventh;

public class RegularInnerClass {
	int a=10;
	int b=20;
	//Inner class
class Inner{
	//Method within inner calss
	public void display() {
		System.out.println("Addition="+(a+b));
	}
}
public static void main(String[] args) {
	
	RegularInnerClass outer=new RegularInnerClass();
	RegularInnerClass.Inner inner=outer.new Inner();
	
	inner.display();
	
}	
}