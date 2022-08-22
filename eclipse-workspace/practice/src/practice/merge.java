package practice;
import java.util.ArrayList;
import java.util.List;

public class merge {
  public static void main(String[] args) {
	List<Integer> li1=new ArrayList<Integer>();
	li1.add(1);
	li1.add(3);
	List<Integer> li2=new ArrayList<Integer>();
	li1.add(4);
	li1.add(5);
	li1.addAll(li2);
	System.out.println(li1);
}
}
