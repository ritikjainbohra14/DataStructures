import java.util.*;

class Main {
  public static int[] twoSum(int[] nums, int target) {
    int[] indices = new int[2];
    int[] numsSorted = nums.clone();
    Arrays.sort(numsSorted);
    int left = 0;
    int right = numsSorted.length - 1;
    while (left < right) {
      int sum = numsSorted[left] + numsSorted[right];
      if (sum == target) {
        int leftIdx = -1;
        int rightIdx = -1;
        for (int i = 0; i < nums.length; i++) {
          if (nums[i] == numsSorted[left] && leftIdx == -1) {
            leftIdx = i;
          } else if (nums[i] == numsSorted[right] && rightIdx == -1) {
            rightIdx = i;
          }
          if (leftIdx != -1 && rightIdx != -1) {
            indices[0] = leftIdx;
            indices[1] = rightIdx;
            break;
          }
        }
        break;
      } else if (sum < target) {
        left++;
      } else {
        right--;
      }
    }
    return indices;
  }

  public static int romanToInt(String s) {
    // Split the Roman numeral into individual characters
    char[] chars = s.toCharArray();

    // Initialize a variable to store the result, and set it to zero
    int result = 0;

    // Iterate through the characters in the Roman numeral
    for (int i = 0; i < chars.length; i++) {
      // Get the value of the current character
      int value = 0;
      switch (chars[i]) {
        case 'I':
          value = 1;
          break;
        case 'V':
          value = 5;
          break;
        case 'X':
          value = 10;
          break;
        case 'L':
          value = 50;
          break;
        case 'C':
          value = 100;
          break;
        case 'D':
          value = 500;
          break;
        case 'M':
          value = 1000;
          break;
      }

      // If the character is the last character in the Roman numeral, or the next character has a smaller value, add the value of the character to the result
      if (i == chars.length - 1 || value >= getValue(chars[i + 1])) {
        result += value;
      }
      // If the next character has a larger value, subtract the value of the current character from the result
      else {
        result -= value;
      }
    }

    // Return the result
    return result;
  }

  // Helper function that returns the value of a Roman numeral
  private static int getValue(char c) {
    switch (c) {
      case 'I':
        return 1;
      case 'V':
        return 5;
      case 'X':
        return 10;
      case 'L':
        return 50;
      case 'C':
        return 100;
      case 'D':
        return 500;
      case 'M':
        return 1000;
      default:
        return 0;
    }
  }

//   public String longestCommonPrefix(String[] strs) {
//     for(int i=0 ; i<strs.length ; i++){
//         String str1 = strs[i];
//         char[] chars = str1.toCharArray();


//         // String temp  =  st1;



//     }
// }

public static boolean isValid(String s) {
  char[] chars = s.toCharArray();

  if (chars[s.length()-1] == '(' || chars[s.length()-1] == '{' || chars[s.length()-1] == '[' ) {
      return false;
  }
  
  for(int i=0 ; i<s.length() ; i++){
    
     if(chars[i] == '(' && chars[i+1] == ')'){
         return true;
     }if(chars[i] == '[' && chars[i+1] == ']'){
         return true;
     }if(chars[i] == '{' && chars[i+1] == '}'){
         return true;
     }

     
  }
  return false;
}

public static int maximumCount(int[] nums) {
  int posi =0;
  int neg = 0;
  for(int i= 0 ; i<nums.length ; i++){
      if(nums[i] == 0){
          continue;
      }else if(nums[i]>0){
          posi++;
      }else{
          neg++;
      }
  }
    
    if(posi>neg){
      return posi;  
    }else{
      return neg;
    }
}

// public  static boolean containsDuplicate(int[] nums) {
  
// }

// public static void oneplus(int digit[]) {
//   int num = 0;
  
//   for (int i = 0; i < digit.length; i++) {
//     num = num*10 + digit[i];
//   }

//   int finalnum = num +1;
//   int i =0;

// for (int j = 0; j < finalnumy.length; j++) {
  
// }
//   System.out.println(finalnum);
//   printarray(finalnumy);
// }

public static int[] plusOne(int[] digits) {

  int i = digits.length - 1;

  while (i >=0 && digits[i] == 9) {
      i --;
  }
  

  if (i == -1) {
      int[] result = new int[digits.length + 1];
      result[0] = 1;
      return result;
  }
  

  int[] result = new int[digits.length];
  
  result[i] = digits[i] + 1;
  for (int j = 0; j < i; j ++) {
      result[j] = digits[j];
  }
  
  return result;
  
}

public static void printarray(int finalnum[]) {
  for (int i = 0; i < finalnum.length; i++) {
    System.out.print(finalnum[i]);
  }
}

public static int numOfSubarrays(int nums[], int k) {
  int count = 0;
  for (int i = 0; i < nums.length; i++) {
      int pairs = 0;
      for (int j = i + 1; j < nums.length; j++) {
          if (nums[i] == nums[j]) {
              pairs++;
          }
       
      }

      if (pairs >= k) {
        count++;
    }
    
     
  }
  return count;
  
}
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
     int temp[] = new int[m + n]; 
     int i = 0;
     int j = 0;
     int k = 0;


     while(i<m && j <n){
         if(nums1[i] < nums2[j]){
             temp[k] = nums1[i];
             i++;
         }else if(nums1[i] > nums2[j]){
             temp[k] = nums1[j];
             j++;
         }
         k++;
     }

      while (i < m ) {
          temp[k++] = nums1[i++];
      }

      while (j < n) {
          temp[k++] = nums2[j++];
      }

      for (int k2 = 0; k2 < temp.length; k2++) {
          System.out.print(temp[k2]);
      }
  }

  public static void reverseString(char[] s) {
     char temp[] = new char[s.length];
    
     System.out.println();
    for(int i=0, j = s.length-1; i<s.length ; i++, j--) {
        temp[i] = s[j];
    }
    System.out.println();

    s = temp;
    for (int i = 0; i < s.length; i++) {
      System.out.print(s[i]+ " ");
     }   

}



      public static void reverseString2(char[] s) {
        char temp[] = new char[s.length];

        for(int i=0 ; i<s.length ; i++){
            temp[i] = s[i];
        }
        
        for(int i=0, j = s.length-1; i<s.length; i++, j--) {
            s[i] = temp[j];

            System.out.print(s[i]);
          }
        }

        public static void intersectionoftwoarray(int nums1[] , int nums2[]) {
          int temp[] = new int[nums1.length + nums2.length];
          int k =0;

          for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
              if(nums1[i] == nums2[j] ){
                temp[k] = nums1[i];
                k++;
                break;
              }
            }
          }

          for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
          }
          System.out.println();
        }

        public static void lengthoflastword(String word) {
           int i = word.length() -1 ;
          int count = 0;
          //System.out.println(word.length());
          while(i>=0){
            if (count == 0 && word.charAt(i) == ' ') {
              i--;
            } else {
              
              //System.out.println(count);
              if (word.charAt(i) == ' ') {
                break;
              }
              count++;
              i--;
            }
          }

          System.out.println(count);
          }

          public static void titleToNumber(String columnTitle) {
           // char[] chars = columnTitle.toCharArray();
          //  int temp = (int)columnTitle.charAt(0) - 64;
          //  int temp2 = (int)columnTitle.charAt(1) - 64;

          //  System.out.println(temp);
          //  System.out.println(temp2);
          // int ans;

            // int once = (int)columnTitle.charAt(1) - 64;
            // int tenth = ((int)columnTitle.charAt(0) - 64 ) * 26 ;
            // int and = once  + tenth;
            // System.out.println(and);

            int n = columnTitle.length() - 1;
            int i =0;
            int finalans = 0 , test = 0;

            while (i<=columnTitle.length()-1) {
              test = (int)Math.pow(26, n)*(int)(columnTitle.charAt(i)-64);
              finalans += test;
              i++;
              n--;
            }

            System.out.println(finalans);
               
          }

          public static  boolean isHappy(int n) {
              while (n >6) {
                int temp = 0;
                int r = n;
                while (r>0) {
                  // if (r == n) {
                  //   return false;
                  // }
                  int rem = r%10;
                  temp += rem*rem;
                  r = r/10;
                }

                if (temp == 1) {
                  return true;
                }

                n = temp;
              

                }

              return false;
          }

  

    public static int alternateDigitSum(int n) {
      int newnum = 0; 
      while(n>0){
          int temp = n % 10;
          newnum = temp  + newnum*10;
          n = n/10;
          
      }


      int sum = 0  , count = 0;  
      while(newnum > 0){
          count++;
          int digit = newnum % 10;
          if(count % 2 == 0){
              sum = sum - digit;
          }else{
              sum = sum + digit;
          }

          newnum = newnum/10;
          
      }
        
        return sum;
    }

    public static int[][] sortTheStudents(int[][] score, int k) {
      for (int i = 0; i < score.length -1; i++) {
        if(score[i+1][k] > score[i][k] && i+1 < score.length){
          for (int j = 0; j < score[i].length; j++) {
            int temp = score[i+1][j];
            score[i+1][j] = score[i][j];
            score[i][j] = temp;

          }
        }
      }

      return score;
    }

    public static  int majorityElement(int[] nums) {
      int count;
      int ans = 0;
     for(int i = 0; i< nums.length ; i++){
         count = 1;
        
         for(int j = i+1 ; j < nums.length ; j++){
            //  if(ans == nums[i]){
            //      break;
            //  }
             if(nums[i] == nums[j]){
                 count++;
                 //System.out.println(count);
              
             }
            
            }
            //System.out.println(count);

            if(count>nums.length/2){
              ans = nums[i];
          }
     }

     return ans;
 }

 public static boolean isPowerOfFour(int n) {

  for (int i = 0; i <=n/4; i++) {
    if (Math.pow(4, i) == n) {
        return true;
    }
  }

  return false;

}

public static List<String> fizzBuzz(int n) {
  ArrayList<String> s = new ArrayList<>();
 for (int i = 0; i < n; i++) {
    s.add(i, "star");
 }
int i = 1 , j=0;

  while(i <= n) {
  if (i % 5 ==0 && i%3 == 0) {
      s.set(j, "FizzBuzz");
      i++;
      j++;
  }

  if (i % 5 == 0) {
    s.set(j, "Buzz");
    i++;
    j++;
  }

  if (i%3 ==0 ) {
    s.set(j, "Fizz");
    i++;
    j++;
  }else{
    String b = Integer.toString(i);
    s.set(j, b);
    i++;
    j++;
  }
 }

 return s;

}

public static String categorizeBox(int length, int width, int height, int mass) {
  boolean a = ((length>=10000) || (width>=10000) || (height>=10000) ) ||( (long)length*width*height >= 1000000000); 
  boolean b = (mass>=100);
  if(a==false && b==false) {
      return "Neither"; 
  }
  else if(a==true && b==true) {
      return "Both";
  }
  else if(a==true && b==false) {
      return "Bulky";
  }else {
    return "Heavy";
  }


}



public static void name() {
  if (2909*3968*3272 >= 1000000000) {
    System.out.println("yes");
  }else{
    System.out.println("no");
  }
}

public static int addDigits(int num) {
    int new_num = 0;
    while(num>0){
      int temp = num%10;
      new_num += temp;
      num = num/10;
      System.out.println(new_num);
    }
    if(new_num/10 == 0){
      System.out.println(new_num);
      return new_num;
    }else{
      System.out.println(new_num);
      return addDigits(new_num);
    }
}



  public static void main(String[] args) {
    // int[] nums = {2, 7, 11, 15};
    // int target = 9;
    // int[] indices = twoSum(nums, target);
    // System.out.println(Arrays.toString(indices));  // prints [0, 1]
  //  isValid("()");
   //System.out.println(isValid("(("));
  // int nums[] = {3,1,4,3,2,2,4};
  //  System.out.println(maximumCount(nums));
  //System.out.println(containsDuplicate(nums));

  //oneplus(nums);

  //System.out.println(plusOne(nums));
// System.out.println(numOfSubarrays(nums, 2));

// int nums1[] = {1,2,3};
// int nums2[] = {2,5,6};

// merge(nums1, 3, nums2, 3);
  // char s[] = {'H','a','n','n','a','h'};
 // reverseString(s);
//  reverseString2(s);

// String word = "   fly me   to   the moon  ";
// lengthoflastword(word);

//titleToNumber("AAA");
//System.out.println(isHappy(2));
// int score[][] = {{3,4},
//                 {5,6}};
// System.out.println(sortTheStudents(score, 0));
// int nums[] = {2,2,1,1,1,2,2};
// System.out.println(majorityElement(nums));

//System.out.println(isPowerOfFour(4));
// System.out.println(fizzBuzz(5));
//System.out.println(categorizeBox(2909, 3968, 3272, 727));
addDigits(38);



  }
}
