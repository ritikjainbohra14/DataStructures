import java.util.*;

//import javax.lang.model.util.ElementScanner14;

public class arraycc {


    public static int linearsearch(int number[] , int key){
        for (int i = 0; i < number.length; i++) {
            
            if(key == number[i]){
                return i;
            }
        }





        return -1;
    }

    public static int largestnumber(int number[]){
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if(largest<number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
    public static int smallestnumber(int number[]){
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if(smallest>number[i]){
                smallest = number[i];
            }
        }
        return smallest;
    }

    public static int binarysearch(int number[] , int key){

        int start = 0 , end = number.length - 1; 
        while(start<=end){
            int mid = (start + end)/2;
            
            if (number[mid]==key) {
                return mid;
            }
            if (number[mid]<key) {
                start = mid +1;
            } else {
                end = end -1;
                
            }
        }

        return -1;  
    
    }

    public static void reverse(int number[]){
        int rev[] = new int[number.length];
        int n = number.length;
        for (int i = 0; i < number.length; i++) {
            rev[i] = number[n-1];
            n--;

        }

        for (int i = 0; i < rev.length; i++) {
            
            System.out.print(rev[i] + " ");
        }
    }

    public static void pair(int number[]){
        for (int i = 0; i < number.length; i++) {
            int cur = number[i];
            for (int j = i+1; j < number.length; j++) {
                System.out.println("(" + cur + "," + number[j] + ")");
            }
        }
    }

    public static void subarray(int number[]){
        int tp = number.length*(number.length  +1)/2;
        int arr[] = new int[tp];
        int index = 0;
        for (int i = 0; i < number.length; i++) {

            for (int j = i; j < number.length; j++) {

                int sum = 0;

                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(number[j2] + " ");
                    sum += number[j2];    
                }
                    arr[index] = sum;
                

                index++;
           
                System.out.println();
            }
            
            System.out.println();
        }
    System.out.println( largestnumber(arr));
    System.out.println( smallestnumber(arr));
      
    //   for (int i = 0; i < arr.length; i++) {
    //     System.out.print(arr[i] + " ");
    //     int largest = Integer.MIN_VALUE;
    //     for (int j = 0; j < arr.length; j++) {
    //         if(arr[j]>largest){
    //             largest = arr[j];
    //         }
    //     }

    //   }
    }

    public static void sumsubarray(int number[]){
        int tp = number.length*(number.length  +1)/2;
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        //int arr[] = new int[tp];
        int index = 0;
        // int prefix[] = new int[number.length];
        // prefix[0] = number[0];

        // for (int i = 1; i < prefix.length; i++) {
        //     prefix[i] = prefix[i-1] + number[i];
        // }


        for (int i = 0; i < number.length; i++) {

            for (int j = i; j < number.length; j++) {

                 cursum = 0;

                for (int j2 = i; j2 <= j; j2++) {
                    //System.out.print(number[j2] + " ");
                    cursum += number[j2];
                       
                }

                System.out.println(cursum); 
                
            
                if (maxsum < cursum) {
                    maxsum = cursum;
                }
            }
           

            System.out.println(maxsum);
            
            System.out.println();
        }
    }

    public static void prefixarray(int number[]){
        //int tp = number.length*(number.length  +1)/2;
        int cursum = 0 ;
        int maxsum = Integer.MIN_VALUE;
        //int arr[] = new int[tp];
        //int index = 0;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + number[i];
        }


        for (int i = 0; i < number.length; i++) {

            for (int j = i; j < number.length; j++) {

            cursum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                
            
                if (maxsum < cursum) {
                    maxsum = cursum;
                }
            }
                   
            System.out.println();
        }
        System.out.println(maxsum);
    }


    public static int kadanes(int number[]){
        int current_sum = 0; 
        int max_sum = Integer.MIN_VALUE;
        
        for (int i = 0; i < number.length; i++) {
           if(number[i]>0)
            break;
           
            if(max_sum<number[i])
                max_sum = number[i];

        }

        for (int i = 0; i < number.length; i++) {
            current_sum += number[i];
           if (current_sum<0) {
              current_sum =0;
           }

           max_sum = Math.max(current_sum, max_sum);
        }

        return max_sum;


    }

    public static int nega(int number[]){
         int max_sum = Integer.MIN_VALUE;
         for (int i = 0; i < number.length; i++) {
            max_sum = Math.max(max_sum, number[i]);
         }

        return max_sum;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int marks[] = new int[50];
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();


        // System.out.println("\nphy :" + marks[0] + "\nmath :\n" + marks[1] + "\neng \n" + marks[2]);
        int number[] = {2,4,6,8,10};
        //linearsearch(number, 99);
        // System.out.println(linearsearch(number, 99));

        // System.out.println(largestnumber(number));

        // System.out.println(binarysearch(number, key));
       //reverse(number);

       //pair(number);
       //sumsubarray(number);

       //prefixarray(number);
      // kadanes(number);
    // for (int i = 0; i < number.length; i++) {
    //     if(number[i]>0){
    //         System.out.println(kadanes(number));

    //     }
    //     break;
    //     else{
    //         System.out.println(nega(number));
    //     }

    //     }
    reverse(number);

    
    }

}
