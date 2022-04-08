package Tenth;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
public static void main(String[] args) {
	String regex="[987]{3}[0-9]{7}";
    String input="9786543987";
    
    Pattern pattern=Pattern.compile(regex);
    Matcher match=pattern.matcher(input);
    
    if(match.matches())
    {
    	System.out.println("valid");
    }
    else
    {
    	System.out.println("not valid");
    }
	 
    
    
}
}
