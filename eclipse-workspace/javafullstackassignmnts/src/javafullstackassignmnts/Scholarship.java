package javafullstackassignmnts;
import java.util.HashMap;
import java.util.Set;
public class Scholarship
{
       public HashMap<String,String> getStudents(HashMap<String,Integer> stu)
       {
              HashMap<String,String> medal = new HashMap<>();
              Set<String> set = stu.keySet();
              for(String s:set)
              {
                     Integer marks = stu.get(s);
                     if(marks>=90)
                     {
                           medal.put(s,"Gold");
                     }
                     else if(marks >=80)
                     {
                           medal.put(s,"Silver");
                     }
                     else if(marks>=70)
                     {
                           medal.put(s,"Bronze");
                     }
              }
              return medal;
       }
       public static void main(String[] ar)
       {
              HashMap<String,Integer> stu = new HashMap<>();
              Scholarship p = new Scholarship();
              stu.put("Aseema",76);
              stu.put("Parveen",89);
              stu.put("Priya",90);
              stu.put("Shruthi",93);
              stu.put("Saundarya",81);
              System.out.println(p.getStudents(stu));
       }
}