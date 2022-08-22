package com.cg.assignemttwo;
import java.util.*;
import java.util.Formatter;
class Player {
	private String name;
	private String country;
	private Skill skill;
	public Player(String name, String country, Skill skill) {
		this.name = name;
		this.country = country;
		this.skill = new Skill();
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
		int flag = 0;
		Formatter formatter = new Formatter();
		formatter.format("%15s %15s %15s\n", "Player", "Country", "Skill");
		for(Player player : playerList) {
		if((player.getSkill()).getSkillName().equals(skill)) {
		flag = 1;
		formatter.format("%15s %15s %15s\n",player.getName(),player.getCountry() ,
				player.getSkill().getSkillName());
		}
		}
		System.out.println(formatter);
		if(flag == 0) {
		System.out.println("Skill not found");
		}
	}
}
public class PlayerSkill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scc = new Scanner(System.in);
        System.out.println("Enter the number of player you want to create: ");
        int n = sc.nextInt();
		Player[] p1 = new Player[n];
		Skill[] s1 = new Skill[n];
		PlayerBo pB = new PlayerBo();
		String name, country, skill;
		for(int i=0;i<n;i++) {
			System.out.println("Enter the player " +(i+1)+ " details");
 		        System.out.println("Enter the player name: ");
				name = scc.nextLine();
				System.out.println("Enter Country name: ");
				country = scc.nextLine();
				System.out.println("Enter skill name: ");
				skill = scc.nextLine();
				s1[i] = new Skill();
				s1[i].setSkillName(skill);
			p1[i] = new Player(name, country, s1[i]);
		}
		int ch;
		do {
		System.out.println("Menu: ");
		System.out.println("1. View Details\n 2. Filter players with skill\n 3.Exit");
		System.out.print("Enter your choice: ");
		ch = sc.nextInt();
		switch(ch) {
		case 1:
			pB.viewDetails(p1);
			break;
		case 2:
			System.out.println("Enter the skill: ");
			String sk = sc.nextLine();
			pB.printPlayerDetailsWithSkill(p1, sk);
			break;
		}
	}
		while(ch != 3);	
	}
}
