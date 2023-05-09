import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class base {
    public static int sum(int number[] , int n){
        int sum =0;
        int count =0;
        int c =0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 1; j < number.length; j++) {
               sum = number[i] + number [j];
               c++;
               if(sum == n){
                  count++;
               } 
            }
        }
        System.out.println(c);
        return sum;
    }
    public static void main(String[] args) {
        int number[] = {3,2,1,2,1,35,5};
        int n=5;

         System.out.println(sum(number, n));
    }
}
