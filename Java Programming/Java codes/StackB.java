import java.util.*;

public class StackB {

    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data =  data;
    //         this.next =  null;
    //     }
    // }

    // static class Stack{
    //    static Node head = null;

    //    public static  boolean isEmpty(){
    //     return head == null;
    //    }

    //    //push
    //    public static void push(int data){
    //     Node newNode = new Node(data); 
    //     if(isEmpty()){
    //         head = newNode;
    //         return;
    //     }

    //     newNode.next = head;
    //     head = newNode;
    //    }

    //    //pop

    //    public static int pop(){
    //     if(isEmpty()){
    //         return -1;
    //     }

    //     int top = head.data;
    //     head = head.next;
    //     return top;
    //    }

    //    //peek
    //    public static int peek(){
    //     if(isEmpty()){
    //         return -1;
    //     }

    //     return head.data;
    //    }
    // }

    public static void pushatbottom(Stack<Integer> s, int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop(); 
        pushatbottom(s, data);
        s.push(top);
    }

    public static String reversestring(String str){
        Stack<Character> s = new Stack<>();

        int idx = 0;

        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }

    public static void reversestack(Stack<Integer> s  ){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reversestack(s);
        pushatbottom(s, top);
    }

    public static void printstack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.print(s.pop());
        }
    }

    public static void stockspan(int stock[] , int span[]) {
        Stack<Integer> s = new Stack();

        span[0] = 1;
        s.push(0);

        for (int j = 1; j < stock.length; j++) {
            int currelement = stock[j];
            
            while (!s.isEmpty() && currelement> stock[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                span[j] = j+1;
            }else{
                int prevhigh = s.peek();
                span[j] = j - prevhigh; 
            }

            s.push(j);
        }
        

    }

    public static boolean valid(String m ,  Stack<Character> s ){

    for (int i = 0; i < m.length(); i++) {
        if(m.charAt(i) == '(' || m.charAt(i) == '[' || m.charAt(i) == '{'){
            s.push(m.charAt(i));
        }else {
            if (s.peek() == '(' && m.charAt(i) == ')' ){
                s.pop();
            }else if(s.peek() == '{' && m.charAt(i) == '}' ){
                s.pop();
            }else if (s.peek() == '[' && m.charAt(i) == ']' ){
                s.pop();
            }
        }
    }

    if(s.isEmpty()){
        return true;
    }else{
        return false;
    }

}

public static boolean isduplicate(String str){
    Stack<Character> s = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if (ch == ')') {
            int count = 0;
            while (!s.isEmpty() && s.peek() != '(') {
                s.pop();
                count++;
            }
            if (count < 1) {
                return true;
            }else{
                s.pop();
            }
        }else{
            s.push(str.charAt(i));
        }


    }

    return false;
}

   public static void main(String args[]){
        String  str = "((a + b))";
        Stack<Character> s = new Stack();

        //System.out.println(valid(, s));
        System.out.println(isduplicate(str));
        //int nxtgReater[] = new int[arr.length];

        // s.push(1);
        // s.push(2);
        // s.push(3);
        // reversestack(s);
        // printstack(s);

    //    while(!s.isEmpty()){
    //         System.out.println(s.peek());
    //         s.pop();
    //     } 



            // String str = "abc";

            // String str1 = reversestring(str);
            // System.out.println(str1);

            // int stock[] = {100,80,60,70,60,85,100};

            // int span[] = new int[stock.length];

            // stockspan(stock, span);

            // for (int i = 0; i < span.length; i++) {
            //     System.out.println(span[i]);
            // }



            //*******************Nest Greater element  ****************************8*/


        //    for (int i = arr.length-1; i>=0; i--) {
        //         // 1 while
        //         while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        //             s.pop();
        //         }

        //         // 2 if-else

        //         if (s.isEmpty()) {
        //             nxtgReater[i] = -1;
        //         }else{
        //             nxtgReater[i] = arr[s.peek()];
        //         }

        //         // 3 push in stack

        //         s.push(i);
        //    }

        //    for (int i = 0; i < nxtgReater.length; i++) {
        //         System.out.println(nxtgReater[i]);
        //    }


        /***************Valid Parebthesis  **********************/


    }
}
