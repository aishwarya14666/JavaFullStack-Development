package polymorphism;

//compile time polymorphism
public class MethodOverloading {
	
	public int add(int x,int y) {
		return x+y;
		
	}
	public int add(int x,int y,int z) {
		return x+y+z;
	}
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		
		System.out.println("calling first method:"+mo.add(5, 4));
		System.out.println("calling second method:"+mo.add(8, 4, 6));
	}

}
