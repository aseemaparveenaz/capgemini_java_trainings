package javafullstackassignmnts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class SortedReverse {
	private static int[] getSorted(int[] arr)
	{
		ArrayList<Integer> array = new ArrayList<>(arr.length);
		for (int i : arr)
		{
			array.add(i);
		}
		System.out.println("Array: "+ array);
		Collections.sort(array);
		System.out.println("Sorted Array: " + array);
		String str = "";
		for (int a : array)
		{
			str += a + "";
		}
		String nstr = "";
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			nstr = ch + nstr;
		}
		System.out.println("Reversed string: " + nstr);
     	int[] numbers = new int[nstr.length()];
     	for (int i = 0; i < nstr.length(); i++) {
     		numbers[i] = nstr.charAt(i) - '0';
     	}
     	System.out.println("Reversed sorted Array: " + Arrays.toString(numbers));
     	return numbers;
}
	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++)
		{
			ar[i] = sc.nextInt();
		}
		System.out.println(getSorted(ar));
	}
}