import java.util.*;

public class QueueB {
    // static class queue{
    //     static int arr[];
    //     static int size;
    //     static int rear;

    //     queue(int n){
    //         arr = new int[n];
    //         size = n;
    //         rear = -1;
    //     }

    //     public static boolean isEmpty(){
    //         return rear == -1;
    //     }

    //     public static void add(int data){
    //         if(rear == size - 1){
    //             System.out.println("Queue is full");
    //             return; 
    //         }

    //         rear = rear +1;
    //         arr[rear] = data;
    //     }

    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("Queue is empty");
    //         }

    //         int front = arr[0];

    //         for (int i = 0; i < rear; i++) {
    //             arr[i] = arr[i+1];
    //         }

    //         rear  = rear -1;

    //         return front;
    //     }

    //     public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("Queue is empty");
    //         }
            
    //         return arr[0];
    //     }
    // }

    // static class queue{
    //     static int arr[];
    //     static int size;
    //     static int rear;
    //     static int front;

    //     queue(int n){
    //         arr = new int[n];
    //         size = n;
    //         rear = -1;
    //         front  = -1;
    //     }

    //     public static boolean isEmpty(){
    //         return rear == -1 && front ==  -1;
    //     }

    //     public static boolean isFull(){
    //         return (rear+1)%size == front;
    //     }

    //     public static void add(int data){
    //         if(isFull()){
    //             System.out.println("Queue is full");
    //             return; 
    //         }

    //         if(front == -1){
    //             front = 0;
    //         }

    //         rear = (rear +1)%size;
    //         arr[rear] = data;
    //     }

    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("Queue is empty");
    //         }

    //         int result = arr[front];
            
            
    //         if(rear == front){
    //             rear = front  = -1;
    //         }else{
    //             front = (front+1)%size;
    //         }

    //         return result;
    //     }

    //     public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("Queue is empty");
    //         }
            
    //         return arr[front];
    //     }
    // }

    // static class Node{
    //     int data;
    //     Node next;

    //     Node(int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    // }


    // static class queue{
    //     static Node head = null;
    //     static Node tail = null;

    //     public static boolean isEmpty(){
    //         return head == null && tail ==  null;
    //     }
    //     public static void add(int data){

    //        Node newnode = new Node(data);
    //        if(head == null){
    //         head = tail = newnode;
    //         return;

    //        }

    //        tail.next = newnode;
    //        tail = newnode;
    //     }

    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("Queue is empty");
    //         }

    //         int front = head.data;

    //         if(tail == head){
    //             tail = head = null;
    //         }else{
    //             head = head.next;
    //         }

    //         return front;
    //     }

    //     public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("Queue is empty");
    //         }
            
    //         return head.data;
    //     }
    // }

// Queue using two Stack


    // static class queue {
    //     static Stack<Integer> s1 = new Stack<>();
    //     static Stack<Integer> s2 = new Stack<>();


    //     // is empty
    //     public static boolean isEmpty(){
    //         return s1.isEmpty();
    //     }

    //     //add

    //     public static void add(int data){
    //         while(!s1.isEmpty()){
    //             s2.push(s1.pop());
    //         }

    //         s1.push(data);

    //         while(!s2.isEmpty()){
    //             s1.push(s2.pop());
    //         }

    //     }

    //     //remove
    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("Queue is Empty");
    //         }

    //         return s1.pop();
         
    //     }

    //     // peek
    //      public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("Queue is Empty");
    //         }

    //         return s1.peek();
         
    //     } 
    
    // }



    // Stack using two queues

    // static class Stack{
    //     static Queue<Integer> q1 = new LinkedList<>();
    //     static Queue<Integer> q2 = new LinkedList<>();

    //     public static boolean isEmpty(){
    //         return q1.isEmpty()&&q2.isEmpty();
    //     }

    //     public static void push(int data){
    //         if(!q1.isEmpty()){
    //             q1.add(data);
    //         }else{
    //             q2.add(data);
    //         }
    //     }

    //     public static int pop(){
    //         if(isEmpty()){
    //             System.out.println("Empty Stack");
    //             return -1;
    //         }

    //         int top = -1;

    //         if(!q1.isEmpty()){
    //             while (!q1.isEmpty()) {
    //                 top = q1.remove();
    //                 if(q1.isEmpty()){
    //                     break;
    //                 }
    //                 q2.add(top);
    //             }

    //         }else{
    //             while (!q2.isEmpty()) {
    //                 top = q2.remove();
    //                 if(q2.isEmpty()){
    //                     break;
    //                 }
    //                 q1.add(top);
    //             }
    //         }

    //         return top;
    //     }

    //     public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("Empty Stack");
    //             return -1;
    //         }

    //         int top = -1;

    //         if(!q1.isEmpty()){
    //             while (!q1.isEmpty()) {
    //                 top = q1.remove();
    //                 q2.add(top);
    //             }

    //         }else{
    //             while (!q2.isEmpty()) {
    //                 top = q2.remove();
    //                 q1.add(top);
    //             }
    //         }

    //         return top; 
    //     }

         
    // } 


    // finr first non repeating letter in a stream of character

    // public static void printNonRepeating(String str){
    //     int freq[] = new int[26];
    //     Queue<Character> q = new LinkedList<>();

    //     for (int i = 0; i < str.length(); i++) {
    //         char ch = str.charAt(i);
    //         q.add(ch);

    //         freq[ch - 'a']++;

    //         while(!q.isEmpty() && freq[q.peek() - 'a'] > 1 ){
    //             q.remove();
    //         }

    //         if(q.isEmpty()){
    //             System.out.println(-1+" ");
    //         }else{
    //             System.out.println(q.peek() + " ");
    //         }
    //     }
    //     System.out.println();
    // }

    // public static void interLeave(Queue<Integer> q){
    //     Queue<Integer> firstHalf = new LinkedList<>();

    //     int size = q.size();

    //     for (int i = 0; i < size/2; i++) {
    //         firstHalf.add(q.remove());
    //     }

    //     while(!firstHalf.isEmpty()){
    //         q.add(firstHalf.remove());
    //         q.add(q.remove());
    //     }
    // }

    // public static void reversalQueue(Queue<Integer> q){
    //     Stack<Integer> s = new Stack<>();

    //     while (!q.isEmpty()) {
    //         s.add(q.remove());
    //     }

    //     while (!s.isEmpty()) {
    //         q.add(s.pop());
    //     }
    // }

    static class Stack{
        Deque<Integer> d = new LinkedList<>();

        public void push(int data){
            d.addLast(data);
        }

        public int push(){
            return d.removeLast();
        }

        public int peek(){
            return d.getLast();
            }
    
        }

    public static void main(String args[]){

       // Queue<Integer> q = new LinkedList<>();

        // q.add(1);
        // q.add(2);
        // q.add(3);

        // while (!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }

            // String s = "aabccxb";
            // printNonRepeating(s);
            
            // q.push(1);
            // q.push(2);
            // q.push(3);

            // while (!q.isEmpty()) {
            //     System.out.println(q.peek());
            //     q.pop();
            // }

            // Queue<Integer> q = new LinkedList<>();
            // q.add(1);
            // q.add(2);
            // q.add(3);
            // q.add(4);
            // q.add(5);
            // q.add(6);
            // q.add(7);
            // q.add(8);
            // q.add(9);
            // q.add(10);

            // //interLeave(q);

            // reversalQueue(q);

            // while (!q.isEmpty()) {
            //     System.out.print(q.peek() + " ");
            //     q.remove();
            // }

        // Deque<Integer> deque = new LinkedList<>();

        // deque.addFirst(1);
        // deque.addFirst(2);
        // System.out.println(deque);
        // deque.removeFirst();
        // System.out.println(deque);

        Stack s = new Stack();


}
    }