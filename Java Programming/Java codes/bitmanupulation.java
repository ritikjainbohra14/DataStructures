import java.util.*;

public class bitmanupulation {
    public static void oddoreven(int n) {
        int num = n & 1;
        if(num == 1){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }

public static int  ith(int n ,int i){
    int bitmask = 1<<i;
    if ((n & bitmask)== 0) {
        return 0;
    }else{
        return 1;
    }
}

public static int setith(int n , int i) {
    int bitmask = 1<<i;
    return n | bitmask ;
}

public static int clearith(int n , int i) {
    int bitmask = ~(1<<i);
    return n & bitmask;
}

public static int  updateithbit(int n , int i , int newbit) {
//       if (newbit == 0) {
//         return clearith(n, i);
//       } else {
//         return setith(n, i);
//       }
n = clearith(n, i);
int bitmask = newbit << i;
return n | bitmask;    
}

public static int clearlastith(int n , int i) {
    int bitmask = ((-1)<<i);
    return n & bitmask;
}

public static int  clearinrange(int n,int i , int j) {
    int a = ((-1)<<j+1);
    int b = (1<<i) - 1;

    return n & (a| b);
}

public static boolean ispoweroftwo(int n){
   return (n&(n-1)) == 0;

}

public static int countsetbits(int n) {
    int count = 0;
    while (n>0) {
        if ((n&1) != 0) {
            count ++;
        }
        n = n>>1;
    }

    return count;
}



public static void main(String args[]){
    //ith(10, 2);
    System.out.println(ispoweroftwo(6));
    System.out.println( countsetbits(5)); 
}
}
