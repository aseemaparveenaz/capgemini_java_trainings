package javafullstackassignmnts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
public class Ex {
   public static void main(String[] args) {
      HashMap<String, String> hMap = new HashMap<>();
      LinkedHashMap<String, String> sortedMap = new LinkedHashMap<>();
      ArrayList<String> list = new ArrayList<>();
      hMap.put("5", "Akshay");
      hMap.put("8", "Veer");
      hMap.put("3", "Guang");
      hMap.put("7", "Bakshi");
      hMap.put("2", "TomTom");
      hMap.put("10", "Chang");
      hMap.put("1", "Sandy");
      for (Map.Entry<String, String> entry : hMap.entrySet()) {
         list.add(entry.getValue());
      }
      Collections.sort(list, new Comparator<String>() {
         public int compare(String str, String str1) {
            return (str).compareTo(str1);
         }
      });
      for (String str : list) {
         for (Entry<String, String> entry : hMap.entrySet()) {
            if (entry.getValue().equals(str)) {
               sortedMap.put(entry.getKey(), str);
            }
         }
      }
      System.out.println(sortedMap);
   }
}