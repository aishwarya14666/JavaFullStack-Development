package Nineth;

import java.util.Scanner;

public class LargestAndSmallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array[]=new int[5];
		//accessing elements from user dynamically
		for(int i=0;i<array.length;i++) 
		{
			System.out.println("Enter the elements");
			array[i]=sc.nextInt();
		}
		int smallest =array[0];
		int largest =array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>largest)
				largest=array[i];
			else if(array[i]<smallest)
				smallest=array[i];
		}
		System.out.println("Smallest number is:"+smallest);
		System.out.println("Largest number is:"+largest);
}
}
