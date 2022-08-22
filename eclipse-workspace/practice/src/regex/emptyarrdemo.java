package regex;

public class emptyarrdemo {
   public static void main(String[] args) {
	int[] arr=new int[10];
	int k;
	//System.out.println(k); // error coming
	for(Integer i: arr)
	{
		System.out.print(i+" ");
	}
}
}
