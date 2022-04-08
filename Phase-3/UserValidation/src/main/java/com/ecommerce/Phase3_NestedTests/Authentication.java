package com.ecommerce.Phase3_NestedTests;

public class Authentication {
	
	public boolean validate(String uname,String pwd) {
		if(uname.equals("Aish") && pwd.equals("Aish"))
			return true;
		else
			return false;
	}

}
