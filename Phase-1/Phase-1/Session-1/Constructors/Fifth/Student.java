package Fifth;

public class Student {
	int Id;
	String Name;
	String Dept;
	Float Fees;
	public Student() {
		Id=10;
		Name="Harsh";
		Dept="EC";
		Fees=70000f;
	}
	public Student(int Id,String Name,String Dept,Float Fees) {
		this.Id=Id;
		this.Name=Name;
		this.Dept=Dept;
		this.Fees=Fees;
	}
	public void display() {
		System.out.println("Student Id="+Id);
		System.out.println("Student Name="+Name);
		System.out.println("Student Dept="+Dept);
		System.out.println("Student Fees="+Fees);
	}
	public static void main(String[] args) {
		Student s=new Student();
		Student s1=new Student(20,"Anish","CS",40000f);
		
		s.display();
		s1.display();
		
	}
	

}
