package Nineth;

import java.util.Scanner;

public class SingleDimensionalArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array[]=new int[5];
		//accessing elements from user dynamically
		for(int i=0;i<array.length;i++) 
		{
			System.out.println("Enter the elements");
			array[i]=sc.nextInt();
		}
		//printing the elements using for each loop
		for(int a:array) {
			System.out.println(a);
		}
	}

}
