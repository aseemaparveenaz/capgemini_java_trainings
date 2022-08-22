package com.cg.pojo;

import java.util.Comparator;
public class countrycomp implements Comparator<Playerpojo>
{

	@Override
	public int compare(Playerpojo o1, Playerpojo o2) 
	{
		
		return o1.getCountry().compareTo(o2.getCountry());
	}

}
