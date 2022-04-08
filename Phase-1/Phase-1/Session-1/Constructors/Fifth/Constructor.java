package Fifth;

public class Constructor {
	int x;
	int y;
	//Default constructor
	 Constructor(){
		 x=5;
		 y=9;
	}
	 //Parameterized constructor
	 Constructor(int x,int y){
		 this.x=x;
		 this.y=y;		
	}
	 //Method
	 public void display() {
		 System.out.println("Addition:"+(x+y));
	 }
	public static void main(String[] args) {
		Constructor m=new Constructor();
		Constructor n=new Constructor(10,20);
		
		System.out.println("This is a default constructor");
		m.display();
		
		System.out.println("This is a parameterized constructor");
		n.display();
	
	}

}
