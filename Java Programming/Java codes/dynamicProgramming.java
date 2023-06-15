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
    public static void main(String args[]){
        int n = 5;
        int f[] = new int[n+1];
        //System.out.println(fib(n,f));
        f[0] = 0;
        f[1] = 1;
        System.out.println(fibTabulation(n, f));
    }
}
