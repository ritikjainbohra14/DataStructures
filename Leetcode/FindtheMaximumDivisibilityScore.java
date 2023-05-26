import java.util.*;

class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
       ArrayList<Integer> list = new ArrayList<>();
       ArrayList<Integer> finalList = new ArrayList<>();

       int j = 0;
       while(j<divisors.length){
           int i = 0;
           int count = 0;
           while(i<nums.length){
           if(nums[i]%divisors[j] == 0){
               count++;
           }
           i++;
        }
        list.add(count);
           j++;
        }

        int a = Collections.max(list);
        for(int m =0 ; m<list.size(); m++){
            if(a == list.get(m)){
                finalList.add(divisors[m]);
            }
        }



        return Collections.min(finalList);
    }
}