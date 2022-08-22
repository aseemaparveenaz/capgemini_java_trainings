package com.cg.filesassignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class ReadPortionOfFile {
	public void readFilePortion(int start, int end) {
		try(FileReader fr = new FileReader("C:\\Users\\ASEEAZ\\eclipse-workspace\\Assignment\\src\\com\\cg\\filesassignment\\outcome.txt");
		BufferedReader br = new BufferedReader(fr))
		{
		br.skip(start);
		int position = start;
		while(br.ready()) {
			if(position <= end)
			{
			System.out.print((char) br.read());
			position++;
			}
			else
			{
			break;
			}
			}
			}
			catch(IOException e) {
			System.out.println(e);
			}
		}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		ReadPortionOfFile obj = new ReadPortionOfFile();
		obj.readFilePortion(start, end);
		sc.close();
	}

}
