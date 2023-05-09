import java.util.*;



public class string {

    public static void string() {
        String str = "abcd";
        //System.out.println(str.length());
        String firstname = "Ritik";
        String lastname = "Bohra";
        String fullname = firstname + " " +lastname;


        //System.out.println(fullname);
        System.out.println(firstname.charAt(0));
    }

    public static void printletter(String str) {
        for (int i = 0;i<str.length();i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println();
    }

    public static boolean stringispalindrome(String str ) {
        for (int i = 0; i < str.length()/2; i++) {
           //str(i)  == str(n-i-1);
           int n = str.length();
           if(str.charAt(i) != str.charAt(n-1-i)){
            return false;
           }

                 
        }

        return true;
    }

    public static float direction(String path) {
        int x=0,y=0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            if(direction == 'S'){
                y--;
            }
            if(direction == 'N'){
                y++;
            }
            if(direction == 'W'){
                x--;
            }
            if(direction == 'E'){
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2 + Y2);


    }

    public static String substring(String str, int si , int ei) {
        
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);

        }

        return substr;
        
    }

    public static void largeststring() {
        String str[] = {"apple" , "banana" , "mango"};
        String largest = str[0];
        for (int i = 0; i < str.length; i++) {
            if (largest.compareTo(str[i])<0) {
                largest = str[i];
            }
        }

        System.out.println(largest);
    }

    public static void StringBuilder() {
        StringBuilder sb = new StringBuilder("");

        for (char ch = 'a'; ch< 'z'; ch++) {
              sb.append(ch);
        }
 
        System.out.println(sb);
    }

    public static String touppercase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));

        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i<str.length()){
                sb.append(str.charAt(i));
                i++;

                sb.append(Character.toUpperCase(str.charAt(i)));
            } else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String compress(String str ){
         String newestr = "";
         for (int i = 0; i < str.length(); i++) {
            Integer count = 1;

            while (i<str.length()-1  && str.charAt(i) == str.charAt(i+1) ) {
                count++;
                i++;
            }

            newestr += str.charAt(i);
            if(count>1){
                newestr += count.toString();
            }
         }

         return newestr;
    } 

    



    // public static String largeststring(String str) {
    // }
    public static void main(String args[]) {
        //String str = "racecor";
        //printletter(str);
        //System.out.println(stringispalindrome(str));
        //stringispalindrome(str);
        // String path = "WNEENESENNN"; 
        // System.out.println(direction(path));

        String str = "aabbcc";

        //System.out.println(touppercase(str));
        System.out.println(compress(str));

    }
}
