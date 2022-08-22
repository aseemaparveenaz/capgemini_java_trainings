package com.cg.pojo;

public class Playerpojo {
 private String name,country;
 private int goal,score;
public Playerpojo(String name, String country, int goal, int score) {
	super();
	this.name = name;
	this.country = country;
	this.goal = goal;
	this.score = score;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getGoal() {
	return goal;
}
public void setGoal(int goal) {
	this.goal = goal;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}

 
}
