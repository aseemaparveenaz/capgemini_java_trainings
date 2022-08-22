package com.cg.assignemttwo;
import java.util.*;



public class Hotelmanagement {
public static void main(String[] args) {
System.out.println("Hotel Tarrif Calculator");
System.out.println(" 1.Deluxe Room");
System.out.println(" 2.Deluxe AC Room");
System.out.println(" 3.Suite AC Room");
Scanner sc = new Scanner(System.in);
int roomType = 0;
String hotelName;
Integer numberOfSqFeet;
System.out.println("Select Room Type:");
roomType = sc.nextInt();
System.out.println("Hotel Name:");
hotelName = sc.next();
System.out.println("Room Square Feet Area:");
numberOfSqFeet = sc.nextInt();
System.out.println("Room has TV (yes/no):");
String isTV = sc.next();
Boolean hasTV = false;
if (isTV.equalsIgnoreCase("yes")) {
hasTV = true;
}
System.out.println("Room has Wifi (yes/no):");
String isWifi = sc.next();
Boolean hasWifi = null;
if (isWifi.equalsIgnoreCase("yes")) {
hasWifi = true;
}
Integer ratePerSqFeet = null;
Hotelmanagement hotelRoomAndCost = new Hotelmanagement();
DeluxeRoom deluxeRoom = hotelRoomAndCost.new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi, ratePerSqFeet);
DeluxeACRoom deluxeACRoom = hotelRoomAndCost.new DeluxeACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi, ratePerSqFeet);
SuiteACRoom suiteACRoom = hotelRoomAndCost.new SuiteACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
if (roomType == 1) {
System.out.println("Room Tariff per day is: " + deluxeRoom.rate);
}
if (roomType == 2) {
System.out.println("Room Tariff per day is: " + deluxeACRoom.rate);
}
if (roomType == 3) {
System.out.println("Room Tariff per day is: " + suiteACRoom.rate);
}
}





class HotelRoom {
protected String hotelName;
protected Integer numberOfSqFeet;
protected Boolean hasTV;
protected Boolean hasWifi;



public String getHotelName() {
return hotelName;
}





public void setHotelName(String hotelName) {
this.hotelName = hotelName;
}





public Integer getNumberOfSqFeet() {
return numberOfSqFeet;
}





public void setNumberOfSqFeet(Integer numberOfSqFeet) {
this.numberOfSqFeet = numberOfSqFeet;
}





public Boolean getHasTV() {
return hasTV;
}





public void setHasTV(Boolean hasTV) {
this.hasTV = hasTV;
}





public Boolean getHasWifi() {
return hasWifi;
}





public void setHasWifi(Boolean hasWifi) {
this.hasWifi = hasWifi;
}





public HotelRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
super();
this.hotelName = hotelName;
this.numberOfSqFeet = numberOfSqFeet;
this.hasTV = hasTV;
this.hasWifi = hasWifi;
}





public int calculateTariff() {
return this.numberOfSqFeet * getRatePerSqFeet();
}





public int getRatePerSqFeet() {
return 0;
}
}





class DeluxeRoom extends HotelRoom {
protected Integer ratePerSqFeet;





public DeluxeRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi,
Integer ratePerSqFeet) {
super(hotelName, numberOfSqFeet, hasTV, hasWifi);
}



public int getRatePerSqFeet() {
this.ratePerSqFeet = 10;
if (hasWifi) {
return ratePerSqFeet + 2;
} else {
return ratePerSqFeet;
}
}



int rate = this.calculateTariff();
}





class DeluxeACRoom extends DeluxeRoom {





public DeluxeACRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi,
Integer ratePerSqFeet) {
super(hotelName, numberOfSqFeet, hasTV, hasWifi, ratePerSqFeet);
ratePerSqFeet = 12;
}



int rate = this.calculateTariff();
}





class SuiteACRoom extends HotelRoom {
private Integer ratePerSqFeet;





public SuiteACRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
super(hotelName, numberOfSqFeet, hasTV, hasWifi);
}



public int getRatePerSqFeet() {
this.ratePerSqFeet = 15;
if (hasWifi) {
return ratePerSqFeet + 2;
} else {
return ratePerSqFeet;
}
}



int rate = this.calculateTariff();
}





}