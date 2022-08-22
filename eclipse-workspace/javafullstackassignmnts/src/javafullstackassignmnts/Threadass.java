package javafullstackassignmnts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Threadass 
{
	public static void main(String[] args)throws IOException 
	{
		try 
		{
			FileInputStream fr = new FileInputStream("C:\\Users\\ASEEAZ\\eclipse-workspace\\javafullstackassignmnts\\src\\javafullstackassignmnts\\Sourcess.txt");
			FileOutputStream fw = new FileOutputStream("C:\\Users\\ASEEAZ\\eclipse-workspace\\javafullstackassignmnts\\src\\javafullstackassignmnts\\Destination.txt");
			int i;
			while ((i = fr.read()) != -1) 
			{
				fw.write((char) i);
			}

			Thread.sleep(5000);
			System.out.println("Copy 10 characters");

		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}

