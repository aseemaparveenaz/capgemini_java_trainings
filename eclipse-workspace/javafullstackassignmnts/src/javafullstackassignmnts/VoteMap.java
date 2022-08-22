package javafullstackassignmnts;
import java.util.*;
public class VoteMap
{
	public static ArrayList<Integer> votersList(HashMap<Integer, Integer> hash_map)
	{
		ArrayList<Integer> keyList = new ArrayList<Integer>(hash_map.keySet());
		ArrayList<Integer> valueList = new ArrayList<Integer>(hash_map.values());
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0 ;i<valueList.size();i++) {
			if(valueList.get(i) > 18) {
				result.add(keyList.get(i));
			}
		}
		return result;
	}
	public static void main(String[] args)
	{
		HashMap<Integer, Integer> hash_map = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> hash_map1 = new HashMap<Integer, Integer>();
		hash_map.put(10, 17);
		hash_map.put(15, 42);
		hash_map.put(20, 33);
		hash_map.put(25, 18);
		hash_map.put(30, 16);
		System.out.println(votersList(hash_map));
	}
}
