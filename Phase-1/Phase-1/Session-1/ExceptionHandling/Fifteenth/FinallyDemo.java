package Fifteenth;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		try
		{
		int num=sc.nextInt();
		System.out.println("The number is:"+num);
	    }
		catch(InputMismatchException e)
		{
			System.out.println("Invalid number"+e);
		}
		finally
		{
		 sc.close();
		 System.out.println("Scanner closed successfully");
		}
		
	}
}
