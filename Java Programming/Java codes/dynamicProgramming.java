import java.util.Arrays;

public class dynamicProgramming {

    public static int fib(int n, int f[]){ // Memomization
        if(n==0 || n==1){
            return n;
        }

        if(f[n] !=0){
            return f[n];
        }

        f[n] = fib(n-1, f) + fib(n-2, f);

        return f[n];
    }

    public static int fibTabulation(int n, int dp[]){
        for (int j = 2; j < dp.length; j++) {
           dp[j] = dp[j-1] + dp[j-2]; 
        }

        return dp[n];
    }


    // memoization code 
    public static int climbingStairs(int n, int ways[]){
        if(n == 0){
            return 1;
        }

        if(n<0){
            return 0;
        }
        if(ways[n] != -1){
            return ways[n];
        }

        ways[n] = climbingStairs(n-1, ways) + climbingStairs(n-2, ways);



        return ways[n];
    }

    public static int climingTabulation(int n, int dpT[]){
        if(n == 0){
            dpT[n] = 0;           
        }

        if(n==1){
            dpT[n] = 1;
        }

        

        for (int i = 2; i < dpT.length; i++) {
           dpT[i] = dpT[i-1] + dpT[i-2]; 
        }

        return dpT[n];
    }
    public static void main(String args[]){
        // int n = 5;
        // int f[] = new int[n+1];
        // //System.out.println(fib(n,f));
        // f[0] = 0;
        // f[1] = 1;
        // System.out.println(fibTabulation(n, f));

        // int n = 5;
        // int ways[] = new int[n+1];
        // //Arrays.fill(ways, -1);
        // ways[0] = 1;
        // ways[1] = 1;
        // // ways[1] = 1;
        // System.out.println(climingTabulation(n, ways));

        int a[] = {3,6,5,11};
    }
}
