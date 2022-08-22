package javafullstackassignmnts;
import java.util.*;  
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class SecondSmallest
{
	public static int getSecondSmallest(int[] arr)
	{
		ArrayList<Integer> al = new ArrayList<Integer>(arr.length);
		for (int i : arr) 
		{
			al.add(i);
		}
		Collections.sort(al);
		System.out.println();
		System.out.println("Sorted Array: " + al);
		int element = al.get(1);
		return element;
	}
	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements are: ");
		for (int i = 0; i < n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		int res=getSecondSmallest(arr);
		System.out.println("The second smallest element in array is :" +res);
	}

}
/*public class SecondSmallest
{ 	
	public static int getSecondSmallest(Integer[] a, int total)
	{  
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		int element=list.get(1);  
		return element;  
	}  
	public static void main(String args[])
	{  
		Integer a[]={1,2,5,6,3,2};  
		Integer b[]={44,66,99,77,33,22,55};  
		System.out.println("Second Smallest: "+getSecondSmallest(a,6));  
		System.out.println("Second Smallest: "+getSecondSmallest(b,7));  
	}
} */
