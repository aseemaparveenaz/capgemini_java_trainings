package com.cg.HelloCgWorld;
import java.io.*;
import java.util.*;

class reg
{
ArrayList<String> name=new ArrayList<String>();
ArrayList<String> dob=new ArrayList<String>();
ArrayList<String> contact=new ArrayList<String>();
ArrayList<String> email=new ArrayList<String>();
ArrayList<String> uname=new ArrayList<String>();
ArrayList<String> pswd=new ArrayList<String>();
ArrayList<String> rno=new ArrayList<String>();
Scanner s=new Scanner(System.in);
void signup()
{
System.out.println("**********creating a new user account**********");
System.out.println("Enter the name:");
name.add(s.next());
System.out.println("Enter DOB:");
dob.add(s.next());
System.out.println("Enter contact number:");
contact.add(s.next());
System.out.println("Enter email id:");
email.add(s.next());
System.out.println("Create your username:");
uname.add(s.next());
System.out.println("Create your password");
pswd.add(s.next());
System.out.println("Enter register number:");
rno.add(s.next());
display();
}
void display()
{
System.out.println("**********Details**********:\nName:"+name.get(0)+"\nDOB:"+dob.get(0)+"\nContact number:"+contact.get(0)+"\nEmail id:"+email.get(0)+"\nUsername:"+uname.get(0)+"\nPassword:"+pswd.get(0));
}
}

class login
{
int flag;
String username,pwd;
Scanner s=new Scanner(System.in);
void getdata()
{
System.out.println("**********LOGIN**********");
System.out.println("enter the user name");
username = s.nextLine();
System.out.println("enter the password");
pwd = s.nextLine();
check();
}
void check()
{
String t,k;
t="usr";
k="pass";
if(t.equals(username) && k.equals(pwd))
{
System.out.println("!!!!!login successfull!!!!!");
flag=1;
}
else
{
System.out.println("!!!!!INAVLID CREDENTIALS!!!!!");
}    
}
}

class issue
{
Scanner s=new Scanner(System.in);
ArrayList<String> blist=new ArrayList<String>();
ArrayList<Integer> ct=new ArrayList<Integer>();
String bk;
int flag=0;
int y;
int x;
void ini()
{
blist.add("cn");
blist.add("ooad");
blist.add("toc");
blist.add("oe");
blist.add("mp");
blist.add("dbms");
blist.add("beeme");
blist.add("cp");
blist.add("algebra");
ct.add(5);
ct.add(5);
ct.add(5);
ct.add(5);
ct.add(5);
ct.add(5);
ct.add(5);
ct.add(5);
ct.add(5);
}
void issu()
{
System.out.println("**********issue**********");
System.out.println("enter book name");
bk = s.nextLine();
checkavail();
}
void checkavail()
{
for(int i=0;i<blist.size();i++)
{
if(bk.equals(blist.get(i)) && ct.get(i)>=1)
{
flag=1;
System.out.println(bk+" book is available\n");
System.out.println(bk+" book is issued");
System.out.println("due date:in two weeks");
y=ct.get(i)-1;
ct.set(i,y);
x=i;
System.out.println("now the count of the book is:"+ct.get(x));
}
}
if(flag!=1)
{
System.out.println("book is unavailable");
}
}
}

class return1
{
Scanner s=new Scanner(System.in);
void rtrn()
{
System.out.println("**********return**********");
System.out.println("enter the name of the book to be returned:");
String b = s.nextLine();
System.out.println("book returned");
}
}

class bb
{
public static void main(String args[])
{
int ch;
Scanner s=new Scanner(System.in);
System.out.println("**********BOOK BANK**********");
reg obj=new reg();
login log=new login();
issue i=new issue();
return1 r=new return1();
i.ini();
System.out.println("what do you want to do?:");
System.out.println("1.LOGIN\n2.SIGNUP\n3.ISSUE\n4.RETURN\n5.LOGOUT");
ch=s.nextInt();
while (ch<5)
{
switch(ch)
{
case 1:
log.getdata();
break;
case 2:
obj.signup();
break;
case 3:
i.issu();
break;
case 4:
r.rtrn();
break;
}
System.out.println("what do you want to do?:");
System.out.println("1.LOGIN\n2.SIGNUP\n3.ISSUE\n4.RETURN\n5.LOGOUT");
ch = s.nextInt();
}
if (ch==5)
{
System.out.println("logged out of your account");
}
}
}


