package Fourteenth;

public class Sender {
	
	void send(String msg) {
		System.out.println("Sending message"+msg);
	try {
		Thread.sleep(1000);
	}catch(InterruptedException e) {
		System.out.println("Error while sending message");
	}
	System.out.println("Message sent");
}
}
