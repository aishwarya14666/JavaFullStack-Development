package Nineth;

public class ArrayDemo {
public static void main(String[] args) {
	int Array[]= {0,1,2,3,4,5};
	System.out.println("Size of array="+Array.length);
	System.out.println("Accessing 4th element="+Array[4]);
	System.out.println("Accessing elements using for loop");
	for(int i=0;i<Array.length;i++)
		System.out.println("Elements of array="+i);
	System.out.println("Accessing elements using for each loop");
	for(int a:Array) {
		System.out.println(a);
}
}
}
