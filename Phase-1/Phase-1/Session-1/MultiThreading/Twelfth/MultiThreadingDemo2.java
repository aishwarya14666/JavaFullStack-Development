package Twelfth;

public class MultiThreadingDemo2 implements Runnable {
	//Implements runnable interface
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	try
	{
		Thread.sleep(1000);
	} catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
	public static void main(String[] args) {
		MultiThreadingDemo2 ins1=new MultiThreadingDemo2();
		MultiThreadingDemo2 ins2=new MultiThreadingDemo2();
		
		Thread t1=new Thread(ins1);
		Thread t2=new Thread(ins2);
		
		t1.setName("First");
		t2.setName("Second");
		
		t1.start();
		t2.start();
	}
}
