public class Linklist {

    public static class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
        
}

public static Node head;
public static Node tail;
public static int size;

public void addfirst(int data){
    Node newnode = new Node(data);
    size++;

    // if link list is empty
    if (head==null) {
       head = tail = newnode;
       return; 
    }
    // step 1 = create a node 
    //Node newnode = new Node(data);

    // step 2 = stroe head address in newnode next

    newnode.next = head;

    // step 3 pointing new node on head 

    head = newnode;
}

public void addlast(int data) {
    Node newnode = new Node(data);
    size++;

    if (head == null) {
        head = tail = newnode;
        return ;
    }

    tail.next = newnode;
    tail = newnode;
}

public void printlinklist() {
    if (head==null) {
        System.out.println("Link list is empty");
    }
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + "->");
        temp = temp.next;

    }
    System.out.println("null");
    
}

public void add(int idx , int data){
    if (idx == 0) {
        addfirst(data);
        return;
    }
    size++;
    Node newnode = new Node(data);
    Node temp = head;
    int i = 0;

    while( i < idx - 1){
        temp = temp.next;
        i++;
    }
    //temp - > pre
    newnode.next = temp.next;
    temp.next = newnode;
}

public int removefirat(){
    if(size == 0){
        System.out.println("Linklist is r=empty");
    }else if(size == 1){
        int val = head.data;
        head = tail = null;
        size = 0;
        return val;
    }

    int val = head.data;
    head = head.next;
    size --;
    return val;
}

public int removelast(){
    if(size == 0){
        System.out.println("Lin list is empty");
    }else if(size == 1){
        int val = head.data;
        size = 0;
        head = tail = null;
        return  0 ;
    }
    Node prev = head;
    int val = tail.data;
    for (int i = 0; i < size - 2; i++) {
      prev = prev.next;
    }
    prev.next = null;
    tail = prev;  
    size--;
    return val;
}


public int itrearch(int num) {
    Node temp = head;
    int i = 0;

    while(temp != null){
        if(temp.data == num){
            return i; 
        }
        temp = temp.next;
        i++;
    }

    return -1;
}

public int helper(Node head , int key){
    if(head==null){
        return -1;
    }

    if(head.data ==key){
        return  0;
    }
  

    int idx = helper(head.next, key);
    if(idx == -1){
       return -1; 
    }


    return idx+1;
}
public int recurssive(int key){
    return helper(head, key);
}

public Node reverseList(Node head) {
    Node prev = null;
    Node curr = head;
    Node next;

    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    } 

    head = prev;

    return reverseList(head);

}


public void reverse(){
    Node prev = null;
    Node curr = tail = head;
    Node next;

    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    head = prev;


}

public void removenthfromend(int n){
    int size = 0;
    Node temp = head;
    while(temp != null){
        temp = temp.next;
        size++;
    }

    if(n == size){
        head = head.next;
        return;
    }

    int i = 1;
    int itotravel = size - n;
    Node prev = head;
    while( i < size - n){
        prev = prev.next;
        i++;
    }

    prev.next = prev.next.next;
    return;
}

public Node finalmid(Node head){
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next; // +1
        fast = fast.next.next; // +2
    }

    return slow;
}

public boolean plaindrome(){

    if(head==null || head.next == null ){
        return true;
    }
    // step 1 find mid

    Node midNode = finalmid(head);
    // step 2 reverse 2nd hallf

    Node prev = null;
    Node curr = midNode;
    Node next;

    while(curr  != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    Node right = prev;
    Node left = head;


    // atep 3 check left half na dright half
    while(right != null){
        if(left.data != right.data){
            return false;
        }
        left = left.next;
        right = right.next;
    }

    return true;
}

public static boolean iscycle(){
    Node slow = head;
    Node fast = head;

    while (fast != null &&  fast.next!= null) {
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            return true;
        }
    }

    return false;
}

public static void removecycle() {
    //1 . detect cycle
    Node slow = head;
    Node fast = head;

    boolean cycle = false;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if(fast == slow){
            cycle = true;
            break;
        }
    }

    //2. find meeting point
    slow = head;
    Node prev = null;
    while(slow != fast){
        prev = fast;
        slow = slow.next;
        fast = fast.next;

    }  

    prev.next = null;
}

private Node getMid(Node head){
    Node slow = head;
    Node fast = head.next;

    while(fast != null && fast.next !=null){
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow;

}


    public Node mergeTwoLists(Node list1, Node list2) {
        Node mergell = new Node(-1);
        Node temp = mergell;

        while (list1 != null  && list2 != null) {
            if(list1.data <= list2.data){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next; 
            }

            while(list1 != null) {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }

            while (list1 != null) {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next; 
            }


          


        }

        return mergell;
    }

private Node merge(Node head1 , Node head2){
    Node mergell = new Node(-1);
    Node temp = mergell;

    while(head1 != null && head2 != null){
       if(head1.data <= head2.data){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
       } else{
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
       } 
    }

    while(head1 != null){
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;

    }

     while(head2 != null){
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;

    } 

    return mergell.next;




}

public Node mergesort(Node head){

    if (head == null ||  head.next == null) {
        return head;
    }
    //find mid

    Node mid = getMid(head);
    // left and right MS
    Node righthead = mid.next;
    mid.next = null;
    Node newLeft = mergesort(head);
    Node newright = mergesort(righthead);


    //merge

    return merge(newLeft , newright);
}

public void zigzag(){
    //find middle
    Node slow = head;
    Node fast = head.next;
    while(fast != null && fast.next != null){
        slow= slow.next;
        fast = fast.next.next;
    }
    Node mid = slow;
    //reverse 2nd half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;
    
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;

    }

    Node left = head;
    Node right = prev;
    Node nextL , nextR;
    // alt marge

    while (left != null && right != null) {
        nextL = left.next;
        left.next = right;
        nextR= right.next;
        right.next = nextL;

        left = nextL;
        right = nextR;
    }
}






    public static void main(String args[]){

     //ll.addlast(5);
        // head = new Node(1);
        // head.next =  new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head.next;
    //ll.printlinklist();
    //System.out.println(ll.plaindrome());
    
      
      //  System.out.println( ll.recurssive(4));
    //   System.out.println(iscycle());
    //   removecycle();
    //   System.out.println(iscycle());
       
    Linklist ll = new Linklist();

    ll.addlast(1);
    ll.addlast(2);
    ll.addlast(3);
    ll.addlast(4);
    ll.addlast(5);
    //System.out.println(ll.head.data);
    ll.printlinklist();
    ll.zigzag();
    ll.printlinklist();


    // ll.printlinklist();
    // ll.head = ll.mergesort(ll.head);
    // ll.printlinklist();
    }
}
