import java.util.*;

public class Hashmap {

  public static boolean isAnangram(String s, String t){
    HashMap<Character, Integer> map = new HashMap<>();

    if(s.length() != t.length()){
      return false;
    }

    for (int i = 0; i < s.length(); i++) {
      map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0 ) + 1);
    }

    for (int i = 0; i < t.length(); i++) {
      char ch = t.charAt(i);
      if(map.get(ch) != null){
        if(map.get(ch) == 1){
          map.remove(ch);
        }else{
          map.put(ch, map.get(ch) -1);
        }
      }else{
        return false;
      }
    }

    if(map.isEmpty()){
      return true;
    }else{
      return false;
    }
  }

  public static String getStart(HashMap<String, String> tickets){
    HashMap<String, String> revMap = new HashMap<>();

    for (String key : tickets.keySet()) {
      revMap.put(tickets.get(key), key);
    }

    for (String key :tickets.keySet() ) {
      if(!revMap.containsKey(key)){
        return key;
      }
    }

    return null;
  }

  public static int uniqueCount(String word){
    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < word.length(); i++) {
      map.put(word.charAt(i), map.getOrDefault(word.charAt(i),0 ) + 1);
    }
    
    int count = 0;
    for (Character key : map.keySet()) {
      if(map.get(key) == 1){
        count++;
      }
      
    }

    return count;
  }

  
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

    // LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

    // lhm.put("a", 1);
    // lhm.put("b", 3);
    // lhm.put("a", 99);

    // System.out.println(lhm);


    //*****************************Majority Element*************************//
        // int arr[] = {1,3,2,5,1,3,1,5,1};

        // HashMap<Integer, Integer> hm = new HashMap<>();

        // for (int i = 0; i < arr.length; i++) {
        //   // if (hm.containsKey(arr[i])) {
        //   //   hm.put(arr[i], hm.get(arr[i])+1);
        //   // }else{
        //   //   hm.put(arr[i], 1);
        //   // }

        //   hm.put(arr[i], hm.getOrDefault(arr[i], 1) + 1);
        // }

        // // Set<Integer> keySet = hm.keySet();

        // for (Integer key : hm.keySet()) {
        //   if ((hm.get(key)) > arr.length/3) {
        //     System.out.println(key);
        //   }
        // }



        // ******************************Valid Anagram ***************************//
          // String s = "race";
          // String t = "care";

          // System.out.println(isAnangram(s, t));

           //*****************Find Itinary from Tickets*******************//

          //  HashMap<String, String> tickets = new HashMap<>();

          //  tickets.put("Chennai", "Bengaluru");
          //  tickets.put("Mumbai", "Delhi");
          //  tickets.put("Goa", "Chennai");
          //  tickets.put("Delhi", "Goa");



          //  String start = getStart(tickets);
          //  System.out.print(start);
          //  for (String keys : tickets.keySet()) {
          //   System.out.print("-->" + tickets.get(start));
          //   start = tickets.get(start);
          //  }


          //*********************Largest Subarray with zero sum******************//

          // int arr[]= {15, -2, 2, -8, 1, 7, 10, 23};

          HashMap<Integer, Integer> map = new HashMap<>();

          // int sum = 0;
          // int len = 0;
          // int j = 0;

          // for (int i = 0; i < arr.length; i++) {
          //   sum += arr[i];
          //   if (map.containsKey(sum)) {
          //     len = Math.max(len, i-map.get(sum) );
          //   }else{
          //     map.put(sum, i);
          //   }
          // }

          // System.out.println(len);
          
          //************************Subaaray sum equal to k***********************//

        //   int arr[] = {10,2,-2,-20,10};
        //   int ans = 0; 
        //   int sum = 0;
        //   int k = -10;
          

        //   //(sum, count)

        //   map.put(0, 1);

        //  for (int i = 0; i < arr.length; i++) {
        //   sum += arr[i];
        //   if(map.containsKey(sum-k)){
        //     ans += map.get(sum-k);
        //   }

        //   map.put(sum, map.getOrDefault(sum, 0) + 1);
        //  } 


        //  System.out.println(ans);

        String word = "alphaadidaa";

        System.out.println(uniqueCount(word));
        
    }    
}
