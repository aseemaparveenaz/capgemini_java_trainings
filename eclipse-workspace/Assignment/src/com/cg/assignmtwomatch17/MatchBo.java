package com.cg.assignmtwomatch17;

import java.util.Scanner;
import java.io.*;
import java.util.*;


class TeamMatch

{

String player[];

String team[];

String match[];

String result;

String result1;

String[] split;

String[] split1;

String str2;

String str1;

String filter;

int n,m,b;

void Player()

{

Scanner sc = new Scanner(System.in);

System.out.println("Enter player count");

n = sc.nextInt();

player = new String[n];

for(int i=0;i<n;i++)

{

Scanner sc1 = new Scanner(System.in);

System.out.println("Enter player"+" "+(i+1)+" "+"details");

player[i]=sc1.nextLine();


}

}

void Team()

{

Scanner sc2 = new Scanner(System.in);

System.out.println("Enter team count");

m = sc2.nextInt();

team = new String[m];

for(int j=0;j<m;j++)

{

Scanner sc3 = new Scanner(System.in);

System.out.println("Enter team"+" "+(j+1)+" "+"details");

team[j]=sc3.nextLine();


}

}

void Match()

{

Scanner sc4 = new Scanner(System.in);

System.out.println("Enter match count");

b = sc4.nextInt();

match = new String[b];

for(int k=0;k<b;k++)

{

Scanner sc5 = new Scanner(System.in);

System.out.println("Enter match"+" "+(k+1)+" "+"details");

match[k]=sc5.nextLine();


}

}


void findTeam()

{

System.out.println("Menu:");

System.out.println("1)Find Team");

System.out.println("2)Find All Matches in A Specific Venue");

System.out.println("Type 1 or 2");

System.out.println("Enter your choice");

Scanner sc6 = new Scanner(System.in);

int a=sc6.nextInt();

switch (a)

{

case 1:

System.out.println("Enter Match date");

Scanner sc7 = new Scanner(System.in);

String m_date=sc7.nextLine();

str1=m_date.trim();

for(int d=0;d<b;d++)

{

result = match[d];

split = result.split(",");

for(int c=0;c<split.length;c++)

{

if(split[c].equals(str1))

{

System.out.println("Team");

System.out.println(split[c+1]+","+split[c+2]);

}

}


}

System.out.println("Do you want to continue?Type Yes or No");

Scanner sc9 = new Scanner(System.in);

String ans =sc9.nextLine();

if(ans.equals("Yes"))

{

findMatch();

}

else

{

System.exit(0);

}

break;

default:

System.out.println("Invalid Input!");

}

}

void findMatch()

{

System.out.println("Menu:");

System.out.println("1)Find Team");

System.out.println("2)Find All Matches in A Specific Venue");

System.out.println("Type 1 or 2");

System.out.println("Enter your choice");

Scanner sc10 = new Scanner(System.in);

int s=sc10.nextInt();

System.out.println("Match details");

System.out.println("Enter Team Name");

Scanner sc11 = new Scanner(System.in);

String t_name=sc11.nextLine();

str2=t_name.trim();


String s1=String.format("%-15s","Date");

String s2=String.format("%-15s","Teamone");

String s3=String.format("%-15s","Teamtwo");

String s4=String.format("%-15s","Venue");

System.out.println(s1+s2+s3+s4);

for(int e=0;e<b;e++)

{

result1 = match[e];

split1 = result1.split(",");


for(int w=0;w<split.length;w++)

{

if(split1[w+1].equals(str2) || split1[w+2].equals(str2))

{

String s5=String.format("%-15s",split1[w]);

String s6=String.format("%-15s",split1[w+1]);

String s7=String.format("%-15s",split1[w+2]);

String s8=String.format("%-15s",split1[w+3]);

System.out.println(s5+s6+s7+s8);

}


}


}


System.out.println("Do you want to continue?Type Yes or No");

Scanner sc12 = new Scanner(System.in);

String ans1 =sc12.nextLine();

if(ans1.equals("Yes"))

{

findTeam();

}

else

{

System.exit(0);

}

}

}

class MatchBo

{

public static void main(String[] args)

{

TeamMatch teammatch = new TeamMatch();

teammatch .Player();

teammatch .Team();

teammatch .Match();

teammatch .findTeam();

}

}