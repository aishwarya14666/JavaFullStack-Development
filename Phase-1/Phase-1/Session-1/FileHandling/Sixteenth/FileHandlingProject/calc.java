package FileHandlingProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.Scanner;

public class calc {
	private static void writeToFile(Exception ex) throws IOException {
	      //Retrieving the log file
	      Path path = Paths.get("D:\\files\\LogFile.txt");
	      byte bytes[] = ("\r\n"+LocalDateTime.now()+": "+ ex.toString()).getBytes();
	      //Appending the exception to your file
	      Files.write(path, bytes,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
	      System.out.println("Exception logged to your file");
	}

		public static void main(String[] args) throws IOException {
			int num1,num2,choice;
			int result = 0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the two numbers for calculation:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			System.out.println("Enter your choice:\n1:Addition\n2:Multiplication\n3:Subtraction\n4:Division\n");
			choice=sc.nextInt();
			sc.close();
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
						try
						{
						result=num1/num2;
						System.out.println("Division of two numbers="+result);
						}catch(ArithmeticException ex) {
					         System.out.println("Warning: You cannot divide an number with 0");
					         writeToFile(ex);
						}
						
					}
						else {
							System.out.println("Invalid choice");
						}
	
			int r=result;
			System.out.println("Final Result:"+r);
			
			File file=new File("D:\\files\\Logfile.txt");
			FileWriter writer=new FileWriter(file, true);
			writer.write("\nFirst Number = "+num1);
			writer.write("\nSecond Number = "+num2);
			writer.write("\n1.Addition 2.Subtraction 3.Multiplication 4.Division \nOperation performed:"+choice);
			writer.write("\nResult="+r);
			System.out.println("Result is appended to the file");
			writer.close();
	}
		
}


