package Thirteenth;

import java.io.Serializable;

public class SerializationDemo implements Serializable
{
	int id;
	transient String Name;//will not serialize this value
	String Dept;
	Float salary;
	
	public SerializationDemo(int id,String Name,String Dept,Float salary) {
		this.id=id;
		this.Name=Name;
		this.Dept=Dept;
		this.salary=salary;
	}
	void display() {
		System.out.println("Details of Employee:"+id+" "+Name+" "+Dept+" "+salary);
	}
public static void main(String[] args) {
	SerializationDemo obj=new SerializationDemo(10,"Xyx","ece", 20000f);
       obj.display();
}
}
