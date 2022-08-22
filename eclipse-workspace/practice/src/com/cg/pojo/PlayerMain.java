package com.cg.pojo;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
public class PlayerMain {
	public static void main(String[] args) {
		List<Playerpojo> plist=new ArrayList<>();
		plist.add(new Playerpojo("aseema","india",80,100));
		plist.add(new Playerpojo("parveen","aus",92,90));
	Collections.sort(plist,new countrycomp());
	for(Playerpojo pl: plist) 
	{
		System.out.println(pl.getName()+"--"+pl.getCountry()+"---"+pl.getScore());
	}

}
}