package Third;
import java.util.Scanner;


public class Calculator {
	public static void main(String[] args) {
		int num1,num2,choice,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers for calculation:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Enter your choice:\n1:Addition\n2:Multiplication\n3:Subtraction\n4:Division\n");
		choice=sc.nextInt();
		if(choice==1) {
			result=num1+num2;
			System.out.println("Addition of two numbers="+result);
		}
			else if(choice==2) {
				result=num1*num2;
				System.out.println("Multiplication of two numbers="+result);
			}
				else if(choice==3) {
					result=num1-num2;
					System.out.println("Subtraction of two numbers="+result);
				}
					else if(choice==4) {
						result=num1/num2;
						System.out.println("Division of two numbers="+result);
					}
						else {
							System.out.println("Invalid choice");
		}
}
}
		
