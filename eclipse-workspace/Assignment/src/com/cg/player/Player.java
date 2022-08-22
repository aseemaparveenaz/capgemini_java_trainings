package com.cg.player;
import java.util.*;
class Player {
private String name;
private String country;
private Skill skill;
public Player(String name, String country, Skill skill) {
this.name = name;
this.country = country;
//this.skill = new Skill();
this.skill = skill;
}
public String getName() {
return name;
}

public String getCountry() {
return country;
}

public Skill getSkill() {
return skill;
}

public void setName(String name) {
this.name = name;
}
public void setCountry(String country) {
this.country = country;
}
public void setSkill(Skill skill) {
this.skill = skill;
}

public String toString() {

String str;
str = (String) String.format("%-15s %-15s %-15s", this.name, this.country, this.skill.getSkillName());
return str;

}
}
class Skill {

private String skillName;



public String getSkillName() {
return skillName;
}



public void setSkillName(String skillName) {
this.skillName = skillName;
}

}
class PlayerBo {

public void viewDetails(Player[] playerList) {

System.out.format("%-15s %-15s %-15s", "Player", "Country", "Skills");
System.out.println();
for(int i=0; i<playerList.length; i++) {

System.out.println(playerList[i].toString());
System.out.println("\n");
}

}

public void printPlayerDetailsWithSkill(Player[] playerList, String skill) {

	int flag= 0;
	Formatter formatter= new Formatter();  
	formatter.format("%15s %15s %15s\n", "Player", "Country", "Skill");  
	for(Player player: playerList) 
	  {if((player.getSkill()).getSkillName().equals(skill)) 
	      {
		  flag= 1;
		  formatter.format("%15s %15s %15s\n", player.getName(), 
	    		  player.getCountry() , player.getSkill().getSkillName()); 
		  }
	  }
	               System.out.println(formatter);
	               if(flag== 0) 
	               {System.out.println("Skill not found");}}

}

