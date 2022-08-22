package leee;

import java.util.HashMap;

public class Arrtosub {
    public boolean isPossible(int[] nums) {
        HashMap<Integer,Integer>counts=new HashMap<>();
        HashMap<Integer,Integer>tails=new HashMap<>();
        for(int n : nums)
            counts.put(n, counts.getOrDefault(n,0)+1);
        
        for(int n : nums)
        {
            if(counts.get(n)==0)
                continue;
            counts.put(n,counts.getOrDefault(n,0)-1);
            if(tails.getOrDefault(n-1,0)>0)
            {
                tails.put(n-1,tails.getOrDefault(n-1,0)-1);
                tails.put(n,tails.getOrDefault(n,0)+1);
            }
            else if(counts.getOrDefault(n+1,0)!=0 && counts.getOrDefault(n+2,0)!=0)
            {
                counts.put(n+1,counts.getOrDefault(n+1,0)-1);
                counts.put(n+2,counts.getOrDefault(n+2,0)-1);
                tails.put(n+2,tails.getOrDefault(n+2,0)+1);
            }
            else return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
		Arrtosub a =new Arrtosub();
		int[] nums = {1,2,3,3,4,5};
		boolean ans=a.isPossible(nums);
		System.out.println(ans);
				
	}
	
}
	

