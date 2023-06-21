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

    public static int knapsack(int val[], int wt[], int W, int n, int dp[][]){
        // O(n*W)
        if(W==0 || n==0){
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W];
        }


        if(wt[n-1]<=W){

            //include
            int ans1 = val[n-1] + knapsack(val, wt, W-wt[n-1], n-1,dp);


            //exclude
            int ans2 = knapsack(val, wt, W, n-1, dp);
            dp[n][W] = Math.max(ans1, ans2);

            return Math.max(ans1, ans2);
        }else{
            dp[n][W] = knapsack(val, wt, W, n-1, dp);
            return dp[n][W];
        }

    }

    public static int knapsackTab(int val[], int wt[], int W, int dp[][]){
        
        int n = val.length;

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }

        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < W+1; j++) {
                int v = val[i-1];// ith item val
                int w = wt[i-1];//ith item value

                if(w<=j){
                    int incProfit = v + dp[i-1][j-w];
                    int excProfit = dp[i-1][j];

                    dp[i][j] = Math.max(incProfit, excProfit);

                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[val.length][W];
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

        //int a[] = {3,6,5,11};

        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        int n = val.length;
        int dp[][] = new int[val.length+1][W+1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println( knapsackTab(val, wt, W, dp));
    }
}
