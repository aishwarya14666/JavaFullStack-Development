package Second1;

import Second.AccessModifiers;

public class AccessInAnotherPackage {
	public static void main(String[] args) {
		AccessModifiers am=new AccessModifiers();
		int a=10;
		int b=20;
		int result1 = am.add(a,b);
		
		int result2 =am.sub(a,b);
		
		int result3=am.mul(a,b);
		
		int result4=am.div(a, b);
	}

}
