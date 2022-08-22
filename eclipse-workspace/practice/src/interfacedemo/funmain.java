package interfacedemo;
import java.util.*;
public class funmain{
	public static void main(String[] args) {
		funmulinter m=(a,b,c)->a*b*c;
		int ans=m.mul(2,5,6);
		System.out.println(ans);
		funconcate co=(s1,s2)->s1.concat(s2);
		String concatans=co.concate("aseema","parveen");
		System.out.println(concatans);
	}
	
}
