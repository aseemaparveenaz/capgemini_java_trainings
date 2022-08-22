package practice;
import java.util.*;
public class ExceptionDemo {
	static int[] arr=new int[5];
	Scanner sc=new Scanner(System.in);
	public void checkInteger() throws CustemEx
	{
		for(int i=0;i<5;i++)
		{
			if(sc.hasNextInt())
			{
				arr[i]=sc.nextInt();
			}
			else
			{
				throw new CustemEx("please enter Integer");
			}
		}
	}
	
	public static void main(String[] args) {
	ExceptionDemo ex=new ExceptionDemo();
	try {
	   ex.checkInteger();
	}
	catch(CustemEx e1)
	{
		System.out.println(e1);
	}

}
}

