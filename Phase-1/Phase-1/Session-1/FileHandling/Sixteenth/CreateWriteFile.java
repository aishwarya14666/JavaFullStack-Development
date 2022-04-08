package Sixteenth;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateWriteFile {
	
	
	public static void CreateFileUsingFileClass() throws IOException 
	{
		File file=new File("D:\\files\\testfile1.txt");
		if(file.createNewFile())
		{
			System.out.println("File is ceated");
		}
		else {
			System.out.println("File already exists");
		}
		//write data to the file
		FileWriter writer=new FileWriter(file,false);
		writer.write("Hello......");
		writer.close();
	}
	public static void CreateFileUsingFileoutputStream() throws IOException
	{
		FileOutputStream out=new FileOutputStream("D:\\files\\testfile2.txt");
		String input="Welcome to File Handling";
		byte array[]=input.getBytes();
		out.write(array);
		System.out.println("Data Written");
		out.close();
	}
	public static void CreateFileUsingNIO() throws IOException
	{
		Path path=Paths.get("D:\\files\\testfile3.txt");
		String input="Lets learn file handlig";
		byte array[]=input.getBytes();
		Files.write(path, array,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Data Written");

		//write data of List to files directly
		
		Path path1=Paths.get("D:\\files\\testfile4.txt");
		List<String> list=Arrays.asList("My first line","My second line");
		Files.write(path1, list, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Data Written");
	}
	public static void main(String[] args) {
		try
		{
			CreateFileUsingFileClass();
			//CreateFileUsingFileoutputStream();
			//CreateFileUsingNIO();
			}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
