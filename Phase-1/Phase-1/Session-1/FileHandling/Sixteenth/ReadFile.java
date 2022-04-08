package Sixteenth;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadFile {
	

	@SuppressWarnings("resource")
	public static void ReadFileUsingFileClass() throws IOException
	{
		FileReader reader=new FileReader("D:\\files\\testfile1.txt");
		int data;
		while((data=reader.read())!=-1)
			System.out.print((char)data);
	}
	@SuppressWarnings("resource")
	public static void ReadFileUsingfileInputStream() throws IOException
	{
		FileInputStream stream= new FileInputStream("D:\\files\\testFile2.txt");
		int data;
		while((data=stream.read())!=-1)
		{
			System.out.print((char)data);
		}
	}
		public static void ReadFileUsingNIO() throws IOException
		{
			Path path=Paths.get("D:\\files\\testfile3.txt");
			List<String> list=Collections.emptyList();
			list= Files.readAllLines(path,StandardCharsets.UTF_8);
			
Iterator<String> it=list.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
}
		}
		public static void main(String[] args) {
			try
			{
				ReadFileUsingFileClass();
				//ReadFileUsingfileInputStream();
				//ReadFileUsingNIO();
		}
			catch(IOException e)
			{
				e.printStackTrace();
			}
	}
	

}
