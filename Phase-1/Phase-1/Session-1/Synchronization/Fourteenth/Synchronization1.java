package Fourteenth;

public class Synchronization1 {
	
	public static void main(String[] args) {
		
		Sender sender=new Sender();
		
		User t1=new User("AAA", " Hello.....!", sender);
		User t2=new User("BBB"," Hi........!", sender);
		
		t1.start();
		t2.start();
		
	}

}
