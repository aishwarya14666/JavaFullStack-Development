package Sixth;
import java.util.ArrayList;



public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> List=new ArrayList<Integer>();
		System.out.println("Array before adding values:"+List.size());
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(4);
		List.add(5);
		System.out.println("array after adding values:"+List);
		List.remove(0);
		System.out.println("array after removing 1st element:"+List);
		System.out.println("third element of remaining array:"+List.get(3));
		List.add(7);
		System.out.println("array after adding values:"+List);
		//iterating using for each loop
		for(Integer i:List)
		{
			System.out.println(i);
	}
		
	}

}
