package com.collection;
import java.util.Set;
import java.util.TreeSet;
class Treeset {
 public static void main(String[] args)
 {
     TreeSet<String> ts1 = new TreeSet<String>();
     ts1.add("A");
     ts1.add("E");
     ts1.add("C");
     ts1.add("C");
     System.out.println("sorted automatically"+ts1);
     String value = ((TreeSet<String>) ts1).floor("D");
     System.out.println("Floor value for C: "
                        + value);
     System.out.println(((TreeSet<String>) ts1).lower("C"));
     System.out.println(((TreeSet<String>) ts1).higher("A"));
     System.out.println("The last element is: " + ((TreeSet<String>) ts1).last());
     System.out.println("First lowest element " + 
             "removed is : " + ((TreeSet<String>) ts1).pollFirst());
     System.out.println("The Last element of the set: "
             + ts1.pollLast());
     //subset
 }

}