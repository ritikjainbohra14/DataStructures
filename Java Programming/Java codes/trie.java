public class trie {

    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        // prefic Notation
        int freq;

        Node(){
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }

            freq  = 1; // prefix Notation
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }else{
                curr.children[idx].freq++; // prefix notation
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }

            curr = curr.children[idx];
        }

        return curr.eow == true;

    }

    public static boolean wordBreak(String key){

        if(key.length() == 0){
            return true;
        }
        for (int i = 1; i < key.length(); i++) {
            //sunstring
            if(search(key.substring(0, i)) && wordBreak(key.substring(i))){
                return true;
            }   
        }

        return false;
    }

    public static void findPrefix(Node root, String ans){
        if(root == null){
            return;
        }

        if(root.freq == 1){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < 26; i++) {
            if(root.children[i] != null){
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }

    public static boolean startsWith(String prefix){
        Node curr= root;

        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';

            if(curr.children[idx] == null){
                return false;
            }

            curr = curr.children[idx];
        }

        return true; 
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if(root.children[i] != null){
               count += countNodes(root.children[i]);
            }
        }

        return count+1;
    }

    public static String ans = "";

    public static void wordWithAllPrefix(Node root, StringBuilder temp){

        if(root == null){
            return;
        }

        for (int i = 0; i < 26; i++) {
            if(root.children[i] != null && root.children[i].eow == true){
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                wordWithAllPrefix(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);//BackTrack
            }
        }
       

            
    }

    

    
    public static void main(String args[]){
        // String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};

        // for (int i = 0; i < arr.length; i++) {
        //     insert(arr[i]);
        // }

        // String key = "ilikesung";

        // System.out.println(wordBreak(key));

        // String arr[] = {"zebra", "dog", "duck", "dove"};

        // for (int i = 0; i < arr.length; i++) {
        //     insert(arr[i]);
        // }

        // root.freq = -1;
        // findPrefix(root, "" );

        // String str = "ababa";

        // //suffix

        // for (int i = 0; i < str.length(); i++) {
        //     String suffix = str.substring(i);

        //     insert(suffix);
        // }

        // System.out.println(countNodes(root));

        String words[] = {"a", "banana", "ap","app", "appl","apple","apply"};

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        

        wordWithAllPrefix(root, new StringBuilder(""));
        System.out.println(ans);




    }
    
}
