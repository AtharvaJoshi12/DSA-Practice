// Find itinerary from tickets
// "chennai","bengaluru"
// "mumbai","delhi"
// "goa","chennai"
// "delhi","goa"

// "mumbai"->"delhi"->"goa"->"chennai"->"bengaluru"

import java.util.HashMap;

public class practice {
     public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revMap = new HashMap<>();
        for (String key:tickets.keySet())
            revMap.put(tickets.get(key),key);

        for (String key: tickets.keySet()){
            if(!revMap.containsKey(key))
                return key;
        }

        return null;
     }
     public static void main(String[] args) {
         HashMap<String,String> tickets = new HashMap<>();
         tickets.put("chennai","bengaluru");
         tickets.put("mumbai","delhi");
         tickets.put("goa","chennai");
         tickets.put("delhi","goa"  );


         String start = getStart(tickets);
         while(tickets.containsKey(start)){
             System.out.print(start + "->");
             start = tickets.get(start);
         }
         System.out.print(start);
     }
}

