package Sixth2;
import java.util.Queue;
import java.util.PriorityQueue;


public class QueueDemo {
public static void main(String[] args) {
	Queue<Integer> q=new PriorityQueue<Integer>();
	for(int i=0;i<5;i++)
		q.add(i);
	System.out.println("Elements of queue:"+q);
	System.out.println("Size of queue:"+q.size());
	System.out.println("Head of queue:"+q.peek());
	System.out.println("Remove head of queue:"+q.remove());
	System.out.println("Final queue:"+q);
	
	
}
}
