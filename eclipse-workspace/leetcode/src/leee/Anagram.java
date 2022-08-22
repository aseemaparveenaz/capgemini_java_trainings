package leee;

class Anagram{
    static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        
        int[] charcount=new int[26];   
        
        for(int i=0;i<s.length();i++)
        {
            charcount[s.charAt(i)-'a']++;;
            charcount[t.charAt(i)-'a']--;;
            
        }
        for(int c:charcount)
        {
            if(c!=0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
    	boolean b=isAnagram("anagram","nagaram");
    	System.out.println(b);
    }
}
