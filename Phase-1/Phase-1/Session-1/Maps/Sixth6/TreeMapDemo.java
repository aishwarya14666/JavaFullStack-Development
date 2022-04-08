package Sixth6;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
		public static void main(String[] args) {
			TreeMap<Integer,String> Map=new TreeMap<Integer,String>();
			Map.put(1,"aaa");
			Map.put(2,"bbb");		
			Map.put(3,"ccc");
			//no null key and multiple null values allowed
			//Map.put(null,"ddd");
			Map.put(4,null);
			Map.put(5,null);
			
			System.out.println("Set of numbers:"+Map);
			System.out.println("Size of set:"+Map.size());
			//No duplicates allowed
			Map.put(1,"aaa");
			System.out.println("Set after adding duplicates:"+Map);
			//get element using key
			System.out.println("Get element:"+Map.get(3));
			System.out.println("Remove element:"+Map.remove(2));
			System.out.println("To check if set is empty?"+Map.isEmpty());
			
			//iterate using for loop
			for(Map.Entry m :Map.entrySet())
			{
				System.out.println(m.getKey()+" "+m.getValue());


	}
		}
		

}
