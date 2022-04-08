package Second1;

import Second.AccessModifiers;

public class AccessOfProtected extends AccessModifiers {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		AccessOfProtected am=new AccessOfProtected();
		int result1 = am.add(a,b);
		
		int result2 =am.sub(a,b);
		
		int result3=am.mul(a,b);
		
		int result4=am.div(a, b);
	}

}
