import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class practice {

     public static void main(String[] args) {

         HashMap<String,Integer> map = new HashMap<>();

         // Insertion
         map.put("India",120);
         map.put("Us",10);
         map.put("China",150);

         System.out.println(map);

         if(map.containsKey("India"))
             System.out.println("It contains the key");

         System.out.println(map.get("India"));
         System.out.println(map.get("UAE"));

         map.remove("India");

         for (Map.Entry<String,Integer> e:map.entrySet())
             System.out.println("Key - " + e.getKey() +" | "+ " Value - "+e.getValue());

         Set<String> keys = map.keySet();
         for (String key:keys)
             System.out.println(key + " "+map.get(key));
     }
}

