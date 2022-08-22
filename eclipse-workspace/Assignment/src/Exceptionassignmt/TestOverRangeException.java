package Exceptionassignmt;
import java.util.Scanner;
import java.util.*;
public class TestOverRangeException
{
	public static void main(String[] args)
	{
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the total runs scored");
		float totRun=myObj.nextInt();
		myObj.nextLine();
		System.out.println("Enter the total over faced");
		float Over=myObj.nextInt();
		myObj.nextLine();
		try {
			if(Over>=20)
			{
				throw new OverRangeException();
			}
			else 
			{
				double runRate=totRun/Over;
				System.out.printf("Current Run Rate :" +"%.02f",runRate);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
class OverRangeException extends Exception
{
	OverRangeException()
	{
		super("Over is not the specified range");
	}
}