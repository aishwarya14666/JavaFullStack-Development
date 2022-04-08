package MainAssessment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Operations {
	final static String Folder="D:\\files\\";
	
	public static void FilesList()
	{
		File file=new File(Folder);
		File lstFiles[]=file.listFiles();
		
		System.out.println("List of sorted files is displayed---");
		for(int i=0;i<lstFiles.length;i++) {
			if(lstFiles[i].isFile())
				System.out.println("File:"+lstFiles[i].getName());
			else if(lstFiles[i].isDirectory())
				System.out.println("Directory:"+lstFiles[i].getName());
		}
	}
	
	public static void CreateFile() throws IOException
	{
		System.out.println("Enter a name file for created:");
		Scanner sc=new Scanner(System.in);
        String filename=sc.nextLine();
        File file=new File(Folder+filename+".txt");
        if(file.createNewFile())
        {
            System.out.println("File is created");
        }
        else
        {
            System.out.println("File already Exists");
        }	
        sc.close();
	}
	
	public static void SearchFile() {
		
		System.out.println("Enter the file name to be searched");
		Scanner sc=new Scanner(System.in);
		String filename = sc.nextLine();
		Path path= Paths.get(Folder+filename+".txt");
		if(Files.exists(path))
			System.out.println("Searched file exists");
		else
			System.out.println("File does not exists");
		sc.close();
	}
	
	public static void DeleteFile() throws IOException {
		System.out.println("Enter the file name to be deleted:");
		Scanner sc=new Scanner(System.in);
		String filename=sc.nextLine();
		Path path= Paths.get(Folder+filename+".txt");
		if(Files.deleteIfExists(path))
			System.out.println("File deleted");
		else
			System.out.println("file does not exists");
		sc.close();
	}
	
	 private static void closeApp()
	 {
	        System.out.println("Closing your application... \nThank you!");
	 }


	
	
	public static void main(String[] args) throws IOException 
	{
		Operations op=new Operations();
		System.out.println("Application Name:\tLockedMe");
		System.out.println("Developer details:"+"\tName:Aishwarya Chougule");
		op.optionsSelection();
	}
		
	 private static void optionsSelection() throws IOException {
		 
		String[] arr = {"1. To get the file from directory",
                "2. Business Operations",
                "3. Close the application" };
		
		System.out.println("\nEnter your choice:\t");
		int[] arr1 = {1,2,3};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++)
        {
            System.out.println(arr[i]);
            // display the all the Strings mentioned in the String array
        }
        
        
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        for(int j=1;j<=slen;j++)
        {
            if(options==j)
            {
                switch (options)
                {
                case 1:
                	Operations.FilesList();
                	System.out.println();
                	optionsSelection();
                	break;
                case 2 :
                
                	System.out.println("2.Business Operations:");
            		System.out.println("\t1.Create file");
            		System.out.println("\t2.Search file");
            		System.out.println("\t3.Delete file");
            		System.out.println("\t4.Go back");
            		System.out.println("\nEnter your choice:\t");
            		Scanner s=new Scanner(System.in);
            		int choice=s.nextInt();
            		      switch(choice)
            		      {
            		      case 1:
            		    	  CreateFile(); 
            		    	  break;
            		      case 2:
            		    	  SearchFile();
            		    	  break;
            		      case 3:
            		    	  DeleteFile();
            		    	  break;
            		      case 4:
            		    	  System.out.println("Exit from business operations-----");
            		    	  System.out.println();
            		    	  optionsSelection();
            		    	  break;
            		      default:
            		    	  System.out.println("Invalid choice----Enter valid choice");
            		    	  optionsSelection();
            		    	  break;
            		      }while(choice!=4);
            		      break;
                case 3:
                	closeApp();
                	break;
				default:
                	System.out.println("Invalid choice");
                }
            }
        }
	}
}

            		 
		

		
	
