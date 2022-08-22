package javafullstackassignmnts;
import java.io.*;
import java.lang.*;
import java.util.Collections;
import java.util.*;
public class SortOrder 
{
	public static void getSorted(ArrayList<Integer> arrli)
	{
		Collections.reverse(arrli);
		System.out.println("The reversed arralist is" +arrli);
		Collections.sort(arrli);
		System.out.println("The final reveresed and sorted array is "+arrli);
	}
	public static void main(String[] args)
	{
		int n = 5;
		ArrayList<Integer> arrli= new ArrayList<Integer>();
		arrli.add(7);
		arrli.add(4);
		arrli.add(1);
		arrli.add(6);
		arrli.add(3);
		System.out.println("The given arraylist :"+arrli);
		getSorted(arrli);
	}
}