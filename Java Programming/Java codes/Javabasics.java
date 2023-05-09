import java.util.*;
/**
 * Javabasics
 */


public class Javabasics {

    // public static int multiply(int a , int b){
    //     int c = a*b;
    //     System.out.println(c);
    //     return c; 
    // }

    // public static int factorial(int a){
    //     // int f = 1;
    //     int f = 1;
    //     for (int i = 1; i <=a; i++) {
    //         f = f*i;
    //     }
    //     // System.out.println(f);
    //     return f;
    // }

    // public static int bf(int n , int r){
    //     int fact_n = factorial(n);
    //     int fact_r = factorial(r);
    //     int fact_nmr = factorial(n-r);

    //     int bf = fact_n /(fact_r * fact_nmr);

    //     return  bf;
    // }

   //  public static void butterfly(int row){
   //           for (int i = 1; i <= row; i++) {
   //             for (int j = 1; j <= i; j++) {
   //                System.out.print("* ");
   //             }
   //             for (int j = 1; j <= 2*(row-i); j++) {
   //                System.out.print("  ");
   //             }
   //             for (int j = 1; j <= i; j++) {
   //                System.out.print("* ");
   //             }
   //             System.out.println();
   //           }

             

   //           for (int i = row; i>=1; i--) {
   //             for (int j = 1; j <= i; j++) {
   //                System.out.print("* ");
   //             }
   //             for (int j = 1; j <= 2*(row-i); j++) {
   //                System.out.print("  ");
   //             }
   //             for (int j = 1; j <= i; j++) {
   //                System.out.print("* ");
   //             }
   //             System.out.println();
   //           }

   //  }


   // public static void rhombus(int n){
   //       for (int i = 1; i <= n; i++) {
   //          for (int j = 1; j <= (n-i); j++) {
   //             System.out.print("  ");
   //          }

   //         for (int j = 1; j <= n; j++) {
   //             System.out.print("* ");
   //         }
   //         System.out.println();
   //       }
   // }

   // public static void hollowrhombus(int n){
   //       for (int i =1; i <= n; i++) {
   //          for (int j = 1; j <= n-i; j++) {
   //             System.out.print("  ");
   //          }
   //       for (int j = 1; j <= n; j++) {
   //          if(i==1|| i==n || j==1 || j==n){
   //              System.out.print(" *");
   //          }else{
   //             System.out.print("  ");
   //          }

   //       }
   //    System.out.println();
   //       }
   // }


   public static void dimond(int n){
      for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= n-i; j++) {
            System.out.print("  ");
         }

         for (int j = 1; j <= (2*i - 1); j++) {
            System.out.print("* ");
         }
         System.out.println();
      }

    for (int i = n; i>=1; i--) {
      for (int j = 1; j <= n-i; j++) {
         System.out.print("  ");
      }

      for (int j = 1; j <= (2*i - 1); j++) {
         System.out.print("* ");
      }
      System.out.println();
    }  

   }
    // public static boolean isPrime(int n){

    //     // if(n==2){
    //     //     System.out.println("No. is prime");
    //     // }else{
    //         boolean isPrime = true;
    //         for (int i = 2; i <= n-1; i++) {
    //             if(n % i == 0){
    //                  isPrime = false;
    //                  break;
    //             }
    //         }

    //         // if(isprime == true){
    //         //     System.out.println("No. is prime");
    //         // }else{
    //         //     System.out.println("No. is not prime");
    //         // }
    //     return isPrime;
    //     }

    // public static void primeinrange(int n){
    //     for (int i = 0; i <= n; i++) {
            
    //         if(isPrime(i)){
    //             System.out.println(i +" ");
    //         }
    //     }

    //     System.out.println();
    // }


    // public static void decimal(int n){
    //     int mynum = n;
    //     int pow = 0;
    //         int dec = 0;
        
    //     while (n > 0) {
            

    //         int lastdigit = n % 10 ;
    //         dec = dec + (lastdigit*(int)Math.pow(2, pow));

    //         pow++;
             
    //         n = n/10;

            
    //     }

    //     System.out.println( mynum + "=" + dec);
    // }

    // public static void dectobin(int n){

    //     int munym = n;
    //     int pow = 0;
    //     int bin = 0;

    //     while (n >0) {
    //         int rem = n % 2;
    //         bin = bin + (rem*(int)(Math.pow(10, pow)));
    //         n = n/2;
    //         pow++;
    //     }

    //     System.out.println(munym + "= " + bin);
    // }

    // public static void hollowrec(int totrow , int totcol ){
    //     for (int i = 1; i <= totrow; i++) {
            
    //         for (int j = 1; j <= totcol; j++) {
    //             if(i==1 || j==1 || i == totrow || j==totcol ){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //       }

    //       System.out.println();
    //     }
    // }

    // public static void inve(int totrow , int totcol){
    //         for (int i = 1; i <= totrow; i++) {
    //             for (int j = 1; j <= totrow - i; j++) {
    //                 System.out.print(" ");
    //             }

    //             for (int j = 1; j <= i; j++) {
                 
    //                 System.out.print("*");
    //             }

    //             System.out.println();
    //         }

    // }

    // public static void numinv(int row){
    //     int m = 1;
    //    for (int i = 1; i <= row; i++) {
    //     for (int j = 1; j <=i; j++) {
    //         System.out.print( m+" ");
    //         m++;
    //     }
    //     System.out.println();
    //    }
    // }

    // public static void zeroone(int row){
    // for (int i = 1; i <= row; i++) {
    //     for (int j = 1; j <= i; j++) {
    //         if((i + j )% 2 == 0){
    //             System.out.print("1");
    //         }else{
    //             System.out.print("0");
    //         }
    //     }
    //     System.out.println();
    // }
    // }

    public static void bubblesort(int n , int number[]){
      int swaps = 0;
        for (int i = 0; i < number.length-1; i++) {
        
           for (int j = 0; j < number.length-1-i; j++) {
               if (number[j] > number[j+1]) {
                  int temp = number[j];
                  number[j] = number[j+1];
                  number[j+1] = temp;
                  swaps++;
               }
              
           }
           
        }
        System.out.println(swaps);
        
    }

    public static void selctionsort(int number[]){
        for (int i = 0; i < number.length -1; i++) {
         int minpos = i;
         for (int j = i+1; j < number.length; j++) {
            if(number[minpos] > number[j]){
               minpos = j;
            }
         }
         int temp = number[minpos];
         number[minpos] = number[i];
         number[i]= temp;
         }
    }

    public static void insertionsort(int number[]){
       for (int i = 1; i < number.length; i++) {
         int curr = number[i];
         int prev = i-1;

         while (prev>=0 && number[prev] > curr) {
            number[prev +1] = number[prev];
            prev--;
         }

         number[prev + 1] = curr;
       }
    }

    public static void countarr(int number[]){
      int largest = Integer.MIN_VALUE;

      for (int i = 0; i < number.length; i++) {
         largest = Math.max(largest, number[i]);
      }

      int count[] = new int[largest+1];
      
      for (int i = 0; i < number.length; i++) {
         count[number[i]]++;
      }


      int j=0;
      for (int i = 0; i < count.length; i++) {
         while(count[i]>0){
            number[j] = i;
            j++;
            count[i]--;
         }
         
      }
    }

    public static void printarrr(int number[]){
      for (int i = 0; i < number.length; i++) {
         System.out.print(number[i] + " ");
      }
   }



    


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     char ch = 'A';
    //    for (int i = 1; i <= n; i++) {
    //        for (int j = 1; j <= i; j++) {
    //              System.out.print(ch);
    //              ch++;
    //        }
    //        System.out.println();
    //    }
   // int a = 5;
    // int b = 10;
    // multiply(a, b);
    // int n = 4;
    // factorial(n);

    // System.out.println(bf(4, 3));

    // primeinrange(20);

    // decimal(101);

    // dectobin(5);

    // int x = sc.nextInt();
    // int y = sc.nextInt();

    // hollowrec(x, y);

    // inve(4, 4);

    // numinv(5);
   //  zeroone(4);
   // butterfly(4);

   //hollowrhombus(4);
   //   dimond(4); 
   
   int number[] = {1,4,1,3,2,4,3,7};
   countarr(number);
   printarrr(number);
       }
        


     }
    
