package stringex;

public class StringExample {

	public static void main(String[] args) {
		String str="Aseemaparveen";
		String strex="Aseemaparveen";
		String strignore="ASEEMAPARVEEN";
		System.out.println(str.equalsIgnoreCase(strignore));
		System.out.println(str.equals(strex));
		System.out.println(str.isEmpty());
		int l=str.length();
		char[] chararr=new char[l];
		chararr=str.toCharArray();
		for(char i:chararr)
		{
			System.out.print(i+",");
		}
		System.out.println();
		str="Aseema";
		String s2=" is a software engineer";
		System.out.println(s2.valueOf('a'));
		String s3="I AM UPPERCASE";
		String s4="i am a lower case";
		String[] splitarr=s4.split(" ");
		for(String i:splitarr)
		{
			System.out.println(i);
		}
		System.out.println(str.concat(s2));
		System.out.println("length is "+str.length());
		System.out.println(s4.toUpperCase());
		System.out.println(s3.toLowerCase());

	}

}
