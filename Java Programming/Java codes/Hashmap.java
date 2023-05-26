import java.util.*;

public class Hashmap {
    public static void main(String args[]){
      //create
    //   HashMap<String, Integer> hm = new HashMap<>();

    //   //Insert
    //   hm.put("India", 150);
    //   hm.put("USA", 80);
    //   hm.put("china", 180);
    //   hm.put("Indonesia", 20);
    //   hm.put("Nepal", 15);

    //     // sets
    //     //entryset
    //   Set<String> keys = hm.keySet();
    //   System.out.println(keys);

    //   for (String k : keys) {
    //     System.out.println("key=" +k+ ",value = "+ hm.get(k));
    //   }

    LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

    lhm.put("a", 1);
    lhm.put("b", 3);
    lhm.put("a", 99);

    System.out.println(lhm);
        
    }    
}
