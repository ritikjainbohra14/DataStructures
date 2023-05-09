import java.util.*;
public class contest {
    public static int numOfSubarrays(int nums[], int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int pairs = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    pairs++;
                }

                if (pairs >= k) {
                    count++;
                }
             
            }
      
           
          
           
        }
        return count;
        
      }

      public static long max(int gifts[]){
        int max = 0;
        int j = 0;
        for (int i = 0; i < gifts.length; i++) {
            if(max < gifts[i]){
                max = gifts[i];
            }
            j++;

            
        }
        return max;
      
      }

      public static long pickGifts(int[] gifts, int k) {
        int q = 0;
        for (int i = 0; i <k; i++) {
            long num = max(gifts);
            //System.out.println(num);
            
            for(int l =0 ; l<gifts.length; l++){
                if(num == gifts[l]){
                    q = l;
                }
            }
            gifts[q] = (int)Math.sqrt(num);
            //System.out.println(gifts[q]);

        }
    
        long finalans = 0;
        for (int i = 0; i < gifts.length; i++) {
          finalans += gifts[i];   
        }

        return finalans;
      }

      class Solution {
        public int[] vowelStrings(String[] words, int[][] queries) {
            
            int ans[] = new int[queries.length];
            for(int i=0; i<queries.length; i++) {
                
                int lr = queries[i][0];
                int rr = queries[i][1];
                int count = 0;
                
                for(int j=lr; j<=rr; j++) {
                    String str = words[j];
                    if((str.charAt(0)=='a' || str.charAt(0)=='e' || str.charAt(0)=='i' || str.charAt(0)=='o' || str.charAt(0)=='u') &&                              (str.charAt(str.length()-1)=='a' || str.charAt(str.length()-1)=='e' || str.charAt(str.length()-1)=='i' ||                                    str.charAt(str.length()-1)=='o' || str.charAt(str.length()-1)=='u')) {
                        count++;
                    }
                }
                ans[i] = count;
            }
            
            return ans;
        }
    }
    
     public static int distinctIntegers(int n) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(n);
        int j=0;
        while (j < list1.size()) {
            for(int i = 1 ; i<=n ; i++){
                if (list1.get(j) % i == 1) {
                    if(!list1.contains(i)){
                        list1.add(i); 
                    }  
                } 
              }
            j++;
        }

        System.out.println(list1);
     
        
        return list1.size();
    }

      public static void main(String[] args) {
       
        int max[] = {25,64,9,4,100};
       System.out.println(pickGifts(max, 4));
      }
}
