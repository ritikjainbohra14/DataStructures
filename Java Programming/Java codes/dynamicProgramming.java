import java.util.*;

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

    public static boolean targetSumSubset(int arr[], int sum){
        int n = arr.length;
        boolean dp[][] = new boolean[n+1][sum+1];
    
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                int v = arr[i-1];

                if(v<=j && dp[i-1][j-v]){
                    dp[i][j] = true;
                }
                //exclude
                else if(dp[i-1][j]){
                    dp[i][j] = true;
                }
            }
        }

        return dp[n][sum];
    }

    public static int ubBoundedKnapsack(int val[], int wt[], int W, int dp[][]){
        int n = val.length;

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }

        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < W+1; j++) {
                if(wt[i-1]<=j){
                    dp[i][j] = Math.max(val[i-1] + dp[i][j-wt[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
                
                
            }
        }

        return dp[n][W];
    }

    public static int rodCutting(int len[], int price[], int rodLength, int dp[][]){
        int n = price.length;

        for (int i = 0; i < n+1; i++) {
            dp[i][0] = 0;
        }

        for (int i = 0; i < rodLength+1; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < rodLength+1; j++) {
                if(len[i-1]<=j){
                    dp[i][j] = Math.max(price[i-1] + dp[i][j-len[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][rodLength];
    }

    public static int lcs(String str1, String str2, int n, int m){
        int dp[][] = new int[n+1][m+1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }

        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        if(dp[n][m] != -1){
            return dp[n][m];
        }
        if(n==0 || m==0){
            return 0;
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)){
            dp[n][m] = lcs(str1, str2, n-1, m-1)+1;
            return dp[n][m];
        }else{
            int ans1 = lcs(str1, str2, n-1, m);
            int ans2 = lcs(str1, str2, n, m-1);

            dp[n][m] = Math.max(ans1, ans2);

            return dp[n][m];
        }
    }


    public static int lcsTabulation(String str1, String str2, int n, int m){
        int dp[][] = new int[n+1][m+1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }

        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];

                    dp[i][j] = Math.max(ans1,ans2);
                }
            }
        }

        return dp[n][m];
    }

    public static int longestSubstring(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }

        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i]  = 0;
        }

        int ans= 0; 
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = 0;
                }

                ans = Math.max(ans, dp[i][j]);
            }
        }

        return ans;
    }

    public static int lcs2(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;

        int dp[][] = new int[n+1][m+1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }

        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }

        //bottom up

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {

                if(arr1[i-1] == arr2[j-1]){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];

                    dp[i][j] = Math.max(ans1, ans2);
                }
                
            }
        }

        return dp[n][m];
    }

    public static int lis(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int arr2[] = new int[set.size()];

        int i = 0;
        for (int num : set) {
           arr2[i] = num;
           i++; 
        }

        Arrays.sort(arr2);

        return lcs2(arr,arr2);
    }

    public static int editDistance(String word1, String word2){
        int n = word1.length();
        int m = word2.length();

        int dp[][] = new int[n+1][m+1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = i;
        }

        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    int add = 1 + dp[i][j-1]; 
                    int swap = 1 + dp[i-1][j-1];
                    int delete = 1 + dp[i-1][j];
                    
                    dp[i][j] = Math.min(swap, Math.min(add, delete));
                }
            }
        }

        return dp[n][m];
    }

    public static int stringConversion(String word1, String word2){
        int n = lcs(word1, word2, word1.length(), word2.length());

        int x = word1.length() - n;
        int y = word2.length() - n;

        return x+y;
    }

    public static boolean wildCardMatching(String s1, String s2){
        int n = s1.length();
        int m = s2.length();

        boolean dp[][] = new boolean[n+1][m+1];

        dp[0][0] = true;

        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = false;
        }

        for (int i = 1; i < dp[0].length; i++) {
            if(s2.charAt(i-1) == '*' && dp[0][i-1]){
                dp[0][i] = true;
            }else{
                dp[0][i] = false;
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if((s1.charAt(i-1) == s2.charAt(j-1)) || s2.charAt(j-1) == '*' || s2.charAt(j-1) == '?' ){
                    dp[i][j] = dp[i][j-1];
                }else{
                    dp[i][j] = false;
                }
            }
        }

        return dp[n][m];
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

        // int val[] = {15, 14, 10, 45, 30};
        // int wt[] = {2, 5, 1, 3, 4};
        // int W = 7;
        // int n = val.length;
        // int dp[][] = new int[val.length+1][W+1];

        // for (int i = 0; i < dp.length; i++) {
        //     for (int j = 0; j < dp[0].length; j++) {
        //         dp[i][j] = -1;
        //     }
        // }

        //System.out.println( knapsackTab(val, wt, W, dp));
        
        // int num[] = {4,2,7,1,3};
        // System.out.println(targetSumSubset(num, 10));

        
        //System.out.println(ubBoundedKnapsack(val, wt, W, dp));
        
        // int len[] = {1,2,3,4,5,6,7,8};
        // int price[] = {1,5,8,9,10,17,17,20};

        // int rodlength = 8;
        // int dp[][] = new int[price.length+1][rodlength+1];

        // System.out.println(rodCutting(len, price, rodlength, dp));

        // String str1 = "abcdge";
        // String str2 = "abedg";

        // String str1 = "ABCDE";
        // String str2 = "ABGCE";
        
        // int arr[] = {50, 3, 10, 7, 40, 80};

        // System.out.println(lis(arr));

        //System.out.println(lcs(str1, str2, str1.length(), str2.length()));

        //System.out.println(lcsTabulation(str1, str2, str1.length(), str2.length()));

        //System.out.println(longestSubstring(str1, str2));
            

        // String word1 = "intention";
        // String word2 = "execution";

        // String word1 = "abc";
        // String word2 = "sbd";

        // System.out.println(editDistance(word1, word2));

        String text = "baaabab";
        String pattern = "****ba*****ab";

        System.out.println(wildCardMatching(text, pattern));
    }

}
