package Twelfth;

public class SleepWaitDemo {
	private static Object LOCK=new Object();
	public static void main(String[] args) {
	
	try {
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName()+"is woke up after 1 sec of sleep");
		
	synchronized(LOCK) {
		LOCK.wait(2000);
		System.out.println("Object woke up after 2 sec");
	}
	}catch(InterruptedException e) {
		System.out.println("Display error"+e);
	}


	}
}
