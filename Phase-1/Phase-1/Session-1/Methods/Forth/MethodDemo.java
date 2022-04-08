package Forth;

public class MethodDemo {
		//compile time polymorphism/static polymorphism/early binding
		public void print()
	{
	    System.out.println("Method without return type and without Parameters");
	}

	//method returning nothing with 1 Parameter
	public void display(String name)
	{
	    System.out.println("My Name is "+name);
	}

	//method with return type and parameters
	public int cube(int n)
	{
	    return n*n*n;
	}

	//method return string and with 2 Parameters
	public String fullName(String fname,String lname)
	{
	    return fname+" "+lname;
	}
	public static void main(String[] args) {
		MethodDemo m=new MethodDemo();
		m.print();
		m.display("Aishwarya");
		System.out.println("Cube of 2="+m.cube(2));
		System.out.println("Full name: "+m.fullName("Aishwarya","Chougule"));
		
	}

	}
