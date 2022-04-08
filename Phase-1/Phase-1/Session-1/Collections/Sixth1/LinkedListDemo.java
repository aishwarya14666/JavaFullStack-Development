package Sixth1;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList= new LinkedList<Integer>();
		System.out.println("list before adding elements:"+linkedList.size());
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		System.out.println("list after adding elements:"+linkedList.size());
		System.out.println("list:"+linkedList);
		linkedList.removeFirst();
		System.out.println("list after removing first element:"+linkedList);
		linkedList.removeLast();
		System.out.println("list after removing last element:"+linkedList);
		System.out.println("Third element of list:"+linkedList.get(2));
		
		
	}

}
