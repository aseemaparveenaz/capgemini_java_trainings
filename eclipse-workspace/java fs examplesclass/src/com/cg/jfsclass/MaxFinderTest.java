package com.cg.jfsclass;

@FunctionalInterface
public interface MaxFinder {



int maximum(int num1,int num2);
}



class MaxFinderImpl implements MaxFinder
{



@Override
public int maximum(int num1, int num2) {

return num1>num2?num1:num2;
}
public static void main(String[] args) {
MaxFinder finder=new MaxFinderImpl();
int results=finder.maximum(89,67);
System.out.println(results);
}
}



class MaxFinderTest
{
public static void main(String[] args) {
MaxFinder finder=(num1,num2)->num1>num2?num1:num2;
int results=finder.maximum(88,98);
System.out.println(results);

}
}