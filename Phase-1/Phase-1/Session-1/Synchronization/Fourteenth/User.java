package Fourteenth;

public class User extends Thread {
	
	String Name;
	String msg;
	Sender sender;
	
	public User(String Name,String msg,Sender sender) 
	{
		this.Name=Name;
		this.msg=msg;
		this.sender=sender;
	}
	
public void run() {
	
	System.out.println(Name+" has sent a message---"+msg);
	
synchronized(sender)
{
	sender.send(msg);
}
}
}