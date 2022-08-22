package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {

     Pattern p=Pattern.compile("[0-9]{10}");
     Matcher m=p.matcher("7834937495");
     boolean b=m.matches();
     System.out.println(b);
     
     Pattern p1=Pattern.compile("[a-zA-Z0-9]{1,20}[@]{1}[a-zA-Z]{2,5}");
     Matcher m1=p1.matcher("asee@com");
     boolean b1=m1.matches();
     System.out.println(b1);
     
	}

}
