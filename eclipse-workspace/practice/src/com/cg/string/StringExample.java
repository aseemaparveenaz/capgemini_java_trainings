package com.cg.string;

public class StringExample {



public static void main(String[] args) {
// TODO Auto-generated method stub

String str = "Hello,world";
String str1 = "hello";
System.out.println(str.length());
System.out.println(str.trim());
System.out.println(str.compareTo(str1));
System.out.println(str.concat(str1));
System.out.println(str.isEmpty());
System.out.println(str.toUpperCase());
System.out.println(str.valueOf('e'));
System.out.println(str.replace('l', 'r'));
System.out.println(str.contains("hello"));
System.out.println(str.equals(str1));
System.out.println(str.equalsIgnoreCase(str1));
System.out.println(str.toCharArray());
System.out.println(str.indexOf('e'));
System.out.println(str.lastIndexOf('l'));
System.out.println(str.substring(2, 4));
System.out.println(str.startsWith(str, 'H'));
String a[] = str.split(",");
for(String w:a) {
System.out.println(w);
}
}



}