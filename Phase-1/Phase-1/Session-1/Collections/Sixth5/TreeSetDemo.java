package Sixth5;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> Set=new TreeSet<Integer>();
		Set.add(4);
		Set.add(6);		
		Set.add(2);
		Set.add(9);
		//Order is not maintained
		System.out.println("Set of numbers:"+Set);
		System.out.println("Size of set:"+Set.size());
		//No duplicates allowed
		Set.add(2);
		System.out.println("Set after adding duplicates:"+Set);
		//null not allowed
		//System.out.println("Set after adding null:"+Set.add(null));
		System.out.println("To check if set is empty?"+Set.isEmpty());
	}
}
