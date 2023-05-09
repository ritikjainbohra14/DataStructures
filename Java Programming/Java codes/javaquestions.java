import java.util.*;

public class javaquestions {
// average of three numberss
public static int average(int a, int b, int c){
    int d = (a+b+c)/3;
    return d;
}

// Area of sqaure
public static int areaofsquare(int r){
    int area = (r*r);
    return area;
}

// float problem
public static float totalcost(float pencil , float pen , float eraser){
    float totalcost = pencil + pen + eraser;

    float withgst = totalcost + 0.18f*(totalcost);
    return withgst ;
}

//positive and negative problem
public static void positivenegative(int n){
      if(n<0){
        System.out.println("Negative");
      }
      if (n>0) {
        System.out.println("Positive");
      } else {
        System.out.println("Nor positive nor negative");
      }
}


// Fever or Not
public static void temp(double temp){

    if(temp<100){
        System.out.println("You Dont Have the fever");
    }else{
        System.out.println("You Have fever visit doctor");
    }
}

// Week 
public static void weekdays(int n){
    switch (n) {
        case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;    
    
        default:
        System.out.println("Enter a valid input");
            break;
    }
}

// Leapyear

public static void leapyear(int n){
    if(n%400 == 0){
        System.out.println("yeaar is leap year");;
    }else{
        System.out.println("Not a leap year");
    }
}


// Sum of odd interger and even 
public static void sumofoddandeven(int r[]){
    int odd = 0 , even = 0;
    for (int i = 0; i < r.length; i++) {
        if(r[i] % 2 == 0){
            even += r[i];
        }else{
            odd += r[i];
        }
    }

    System.out.println(even);
    System.out.println(odd);
}


//factorial
public static int factorial(int n){
    int fact = 1;
    for (int i = 1; i <=n; i++) {
        fact = fact*i;
    }
    return fact;
}


//Table

public static void table(int n){
    for (int i = 1; i <= 10; i++) {
        System.out.println(n + "*" + i + "=" + n*i);
    }
}

//Number pyramid pattern

public static void numberpyramid(int n){
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <= n-i ; j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= i; j++) {
            System.out.print(i +" ");
        }
        System.out.println();
    }
 

}

//palindrome pattern
public static void palindromepattern(int n){
    for (int i = 1; i <= 5; i++) {
        for (int j = 0; j <= n-i ; j++) {
            System.out.print(" ");
        }

        for (int j = i; j >= 1; j--) {
            System.out.print(j);
        }

        for (int j = 2; j <= i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
}

// Average of three numbers

public static int averagea(int a, int b ,int c){
    int average = (a+b+c)/3;
    return average;
}

//ISEVEN

public static boolean iseven(){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n%2==0){
        return true;
        
    }
    return false;
}

//Palindrome(IMP)
public static boolean palindrome(){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int num = n;
    int rev = 0;
    while(n != 0){
        int rem = n % 10;
        rev = rev*10 + rem;
        n = n/10;
    }

    if(num == rev){
        return true;
    }else{
        return false;
    }
    

   
}

// SUM OF THE EVERY INTEGER
public static int sumofinteger(){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    while (n != 0) {
        int lastdigit = n % 10;
        sum += lastdigit;
        n = n/10;
    }
    return sum;
}

// Different maths operator
public static double maths(){
    Scanner sc = new Scanner(System.in);
    double x = sc.nextInt();
    double y = sc.nextInt();

    System.out.println(Math.min(x, y));
    System.out.println(Math.max(x, y));
    System.out.println(Math.sqrt(x));
    System.out.println(Math.pow(x, y));
    System.out.println(Math.abs(x));

    return 0;
}

// Array Question
public static void truefalse(int num[] ) {
    for (int i = 0; i < num.length; i++) {
        if ((int)num[i] == (int)num[i+1]) {
            System.out.println("True");
            break;
        } 
    }
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


// S tocky market question
public static int maxprofit(int prizes[]) {
   int buy = prizes[0];
   int profit = 0;

   for (int i = 1; i < prizes.length; i++) {
      if (buy < prizes[i]) {
        profit = Math.max(prizes[i] - buy ,  profit); 
      } else {
        buy = prizes[i];
      }

   }

   return profit;
    
}





    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        //  float x = sc.nextFloat();
        //  float y = sc.nextFloat();
        //  float z = sc.nextFloat();

        // System.out.println(average(x, y, z));
    //    System.out.println(areaofsquare(x));
//  System.out.println(totalcost(x, y, z));

// positivenegative(0);

// double temp = 103.5;
// temp(temp);
// weekdays(5);

// leapyear(2000);
// int r[] = {2,3,5,88,3,7};
//     sumofoddandeven(r);

// System.out.println(factorial(5));

// table(3);

//numberpyramid(6);

// palindromepattern(5);

// System.out.println(averagea(4, 5, 7));
// System.out.println(iseven());
//System.out.println(sumofinteger());
//maths();
int prizes[] = {3,7,5,4,1};
System.out.println(maxprofit(prizes));
}
}



