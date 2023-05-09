import java.util.*;

public class recursion{

    public static void decreasing(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        decreasing(n-1);
    }

    public static void increasing(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        increasing(n-1);
        System.out.println(n);
    }

    public static int factorial(int n) {
        if (n==0) {
            return 1;
        }
        //System.out.println(n);
        int fnone = factorial(n-1);   
        int temp = n * factorial(n-1);
        return temp;
    }

    public static int sum(int n) {
        if (n==0) {
            return 0;
        }
        //System.out.println(n);
        //int fnone = sum(n-1);   
        int temp = n + sum(n-1);
        return temp;
    }

    public static int fibbnacci(int n) {
        if(n==0 || n==1){
            return n;
        }
        int fib1 = fibbnacci(n-1);
        int fib2 = fibbnacci(n-2);

        int temp = fib1 + fib2;
        return temp;
    }

    public static boolean issorted(int arr[], int i) {
        if(i == arr.length -1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }

        return issorted(arr, i+1);
    }

    public static int firstoccurence(int arr[] , int n, int i ) {
        if(i ==  arr.length -1){
            return -1;
        }
        if(arr[i] == n){
            return i;
        }

        return firstoccurence(arr, n, i+1);    
        
        
    }

    public static int lastocurrence(int arr[], int n , int i ) {
        if (i == arr.length -1) {
            return -1;
        } 
        int isfound = lastocurrence(arr, n, i+1);

        if(isfound == -1 && arr[i] == n){
            return i;
        }

        return isfound;
    }

    public static int powerof(int x ,int n) {
        if(n==0){
            return 1;
        }
        int xn1 = powerof(x, n-1);

        int xn = x * xn1;

        return xn ;
    }

    public static int optimisedpower(int a,int n) {

        if (n == 0) {
            return 1;
        }  
        int halfpower = optimisedpower(a, n/2);
        int halfpowersq = halfpower * halfpower ;
        
        if(n % 2 != 0){
          halfpowersq = a * halfpowersq;
        }

        return halfpowersq;
    }

    public static int tileproblem(int n) {
         if(n==0 || n==1){
            return 1;
         }
         // vertical ways
         int fnm1 = tileproblem(n-1);
         // horizontal ways
         int fnm2 = tileproblem(n-2);

         int totways = fnm1 + fnm2;

         return totways;
    }

    public static void removeduplicate(String str , int idx , StringBuilder newstr , boolean map[]) {
        if(idx == str.length()){
           System.out.println(newstr);
           return;
        }

        char currchar = str.charAt(idx);

        if (map[currchar-'a'] == true) {
            removeduplicate(str, idx +1, newstr, map);
        } else {
           map[currchar - 'a'] = true;
           removeduplicate(str, idx+1, newstr.append(currchar), map); 
        }
    }
    public static void main(String[] args) {

    //    System.out.println(fibbnacci(23));
    //    System.out.println(fibbnacci(24));
    //    System.out.println(fibbnacci(26));
    //    System.out.println(fibbnacci(27));
    //    System.out.println(fibbnacci(28));
    //int arr[]  = {8,3,6,9,5,10,2,5,3};
    //System.out.println(issorted(arr, 0));
    //System.out.println( powerof(2, 10));
    String str = "appnnacollege";
    removeduplicate(str, 0,new StringBuilder(""), new boolean[26]);
    //System.out.println(firstoccurence(arr, 32, 0));
    }
}