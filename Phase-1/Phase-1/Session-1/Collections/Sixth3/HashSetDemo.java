package Sixth3;
import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> Set=new HashSet<Integer>();
		Set.add(4);
		Set.add(8);		
		Set.add(1);
		Set.add(9);
		//Order not maintained
		System.out.println("Set of numbers:"+Set);
		System.out.println("Size of set:"+Set.size());
		//No duplicates allowed
		Set.add(8);
		System.out.println("Set after adding duplicates:"+Set);
		//null allowed
		System.out.println("Set after adding null:"+Set.add(null));
		System.out.println("To check if set is empty?"+Set.isEmpty());
		
	}

}
