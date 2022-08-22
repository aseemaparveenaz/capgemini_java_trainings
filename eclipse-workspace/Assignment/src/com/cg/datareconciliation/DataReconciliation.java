package com.cg.datareconciliation;

import java.util.ArrayList;
import java.util.HashMap;
import java.sql.Date;
public class DataReconciliation {
   public static void main(String[] args) {
	    
	    HashMap<String,Xclass> xmap=new HashMap<String,Xclass>();//Creating HashMap
		HashMap<String,Yclass> ymap=new HashMap<String,Yclass>();//Creating HashMap
		xmap.put("x0",new Xclass("000000001","01-Jun-2016",100.00));
		xmap.put("x1",new Xclass("000000001","01-Jun-2016",100.00));
		Xclass var=(Xclass)xmap.get("x0");
		System.out.println(var);
		/*xmap.put("x2",new Xclass());
		xmap.put("x3",new Xclass());
		xmap.put("x4",new Xclass());
		xmap.put("x4",new Xclass());
		xmap.put("x6",new Xclass());
		xmap.put("x7",new Xclass());*/
		ymap.put("y0",new Yclass("000000001", "01-Jun-2016",100.00));
		ymap.put("y1",new Yclass("000000001", "01-Jun-2016", 100.00));
		/*if(xmap.size()==ymap.size())
		{
			for(int i=0;i<xmap.size();i++)
			{
				//if(xmap.get(i))
					System.out.println(xmap.));
			}
		}*/
	
}
	
	
	
	
}
