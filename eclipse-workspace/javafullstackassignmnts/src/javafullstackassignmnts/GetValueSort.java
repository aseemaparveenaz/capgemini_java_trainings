package javafullstackassignmnts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
public class GetValueSort {
	public static ArrayList<String> getValues(HashMap<String, String> hMap,ArrayList<String> anslist )
	{
		ArrayList<String> list = new ArrayList<>();
		for (Map.Entry<String, String> entry : hMap.entrySet()) {
	         list.add(entry.getValue());
	      }
		 Collections.sort(list, new Comparator<String>() {
	         public int compare(String str, String str1) {
	            return (str).compareTo(str1);
	         }
	      });
		 for (String stri : list) {
	         for (Entry<String, String> entry : hMap.entrySet()) {
	            if (entry.getValue().equals(stri)) {
	               anslist.add(entry.getValue());
	            }
	         }
	      }
		 return anslist;
	}
	public static void main(String[] args) {
		HashMap<String, String> hMap = new HashMap<>();
		ArrayList<String> anslist = new ArrayList<>();
	      hMap.put("5", "Aseema");
	      hMap.put("8", "parveen");
	      hMap.put("3", "hello");
	      hMap.put("7", "bye");
	      getValues(hMap,anslist);
		 System.out.println("The returned sorted list is :"+anslist);  
	}
}

