package DataStructures;

public class MainStatistics {
public static void main(String[] args) {
		
	Statistics ob = new Statistics(); 
		
        int arr[] = {12, 3, 57, 4, 19, 26}; 
        
        int left=0;//first index
        
        int n = arr.length;
        
        int right= n-1; //last index
        int k = 3; 
        
        System.out.println("K'th smallest element is "+ ob.kthSmallest(arr, left, right, k)); 
    }

}
