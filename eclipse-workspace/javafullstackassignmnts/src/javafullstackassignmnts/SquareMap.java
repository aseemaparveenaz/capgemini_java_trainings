package javafullstackassignmnts;
import java.util.*; 
public class SquareMap 
{
	public static HashMap<Integer,Integer> getSquares(int[] arr)
	{
		HashMap<Integer, Integer> ansmap = new HashMap<Integer, Integer>();
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			ansmap.put(arr[i],arr[i]*arr[i]);
		}
		return ansmap;
	} 
	   public static void main(String[] args)
	   {
		   int arr[]=new int[9]; //= new int[]{1,2,3,4,5,6,7,8,9};
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the number of elements in array: ");
		   int n=sc.nextInt();
		   System.out.println("Enter the list of numbers :");
		   for(int i=0;i<n;i++)
		   {
			   arr[i]=sc.nextInt();
		   }
		   HashMap<Integer, Integer> map = getSquares(arr); 
		   Iterator<Integer> it = map.keySet().iterator();
		   while(it.hasNext())
		   {
			   Integer key = it.next();
			   if(key==0)
				   continue;
			   else
				   System.out.println(key + " : " + map.get(key));
		   }
      }
}