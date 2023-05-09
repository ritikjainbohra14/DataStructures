import java.util.*;

public class Arraylist {

    public static void swap(ArrayList<Integer> list, int idx1 , int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }

    public static int Maxwater(ArrayList<Integer> height ) {
        int maxwater = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i+1; j < height.size(); j++) {
                int minheight = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int area = minheight*width;
                maxwater = Math.max(maxwater, area);
            }
        }

        return maxwater;
    }

    public static int optimizedmaxwater(ArrayList<Integer> height) {
        int maxwater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            int minheight = Math.min(height.get(lp) , height.get(rp));
            int width = rp - lp;
            int currwater = minheight*width;
            maxwater = Math.max(maxwater, currwater);

            if (height.get(lp) < height.get(rp)) {
                lp++;
            }else{
                rp--;
            }
        }

        return maxwater;
    }

    public static boolean pairsum(ArrayList<Integer> list , int targertsum) {
     
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
             int sum = list.get(i) + list.get(j) ; 
             if(sum == targertsum){
                return true;
             }
        }
    }

    return false;
        
    }

    public static boolean optimizedpairsum(ArrayList<Integer> list , int targertsum) {
        int lp = 0;
        int rp = list.size() - 1;

        while(lp < rp){
            if(list.get(lp) +  list.get(rp) == targertsum){
                return true;
            }else if(list.get(lp) +  list.get(rp) < targertsum){
                lp ++;
            }else{
                rp++;
            }

            
        }
        return false;
    }

    public static boolean pairsum2(ArrayList<Integer> list , int targertsum) {
        int bp = -1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i+1) > list.get(i+1)){
                bp = i;
            }
        }

        int rp = bp;
        int lp = bp +1;

        while (lp!=rp) {
            if (list.get(lp) + list.get(rp) == targertsum) {
                return true;
            }

            if (list.get(lp) + list.get(rp) > targertsum) {
                rp = (list.size() + rp -1) % list.size();
            }

            if (list.get(lp) + list.get(rp) < targertsum) {
                lp = (lp+1)%list.size();
            }
        }

        return false;
    }

    public static void main(String[] args){

        // ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();


        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();


        // for (int i = 1; i <=5; i++) {
        //     list1.add(i*1); // 1 2 3 4 5
        //     list2.add(i*2); //  so  on
        //     list3.add(i*3);
        // }

        // mainlist.add(list1);
        // mainlist.add(list2);
        // mainlist.add(list3);

        // System.out.println(mainlist);

        // for (int i = 0; i < mainlist.size(); i++) {
        //     ArrayList<Integer> cyrrlist = mainlist.get(i);
        //     for (int j = 0; j < cyrrlist.size(); j++) {
        //         System.out.print(cyrrlist.get(j) + " ");
        //     }
        //     System.out.println();
        // }


        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        // list1.add(4);
        // list1.add(5);

        // mainlist.add(list1);

        // ArrayList<Integer> list2 = new ArrayList<>();

        // list2.add(2);
        // list2.add(4);
        // list2.add(6);
        // list2.add(8);
        // list2.add(10);

        // mainlist.add(list2);

        // ArrayList<Integer> list3 = new ArrayList<>();

        // list3.add(3);
        // list3.add(6);
        // list3.add(9);
        // list3.add(12);
        // list3.add(15);

        // mainlist.add(list3);

        // // for (int i = 0; i < mainlist.size(); i++) {
        // //     ArrayList<Integer> currlist = mainlist.get(i);
        // //     for (int j = 0; j < currlist.size(); j++) {
        // //         System.out.print(currlist.get(j) + " ");
        // //     }

        // //     System.out.println();
        // // }

        // System.out.println(mainlist);




// System.out.println(list);   

// print the reverse of arraylist
// for (int i = list.size() - 1; i>=0; i--) {
//     System.out.print(list.get(i));
// }

// maximum in arraylist

// int max = Integer.MIN_VALUE;
// for (int i = 0; i < list.size(); i++) {
//    max = Math.max(max, list.get(i));
// }

// System.out.println("Maximum number is " + max);

//swap 2 number in aaraaylist

// System.out.println(list);

// // int idx = 1 , idx2 = 3;
// // swap(list, idx, idx2);

// Collections.sort(list); //  ascending
// System.out.println(list);


// ///descending
// Collections.sort(list , Collections.reverseOrder());
// System.out.println(list);
ArrayList<Integer> height = new ArrayList<>();
height.add(11);
height.add(15);
height.add(6);
height.add(8);
height.add(9);
height.add(10);
// height.add(7);
// height.add(8);
// height.add(9);
// System.out.println(pairsum(height, 5));

System.out.println(pairsum(height, 100));


// System.out.println(optimizedmaxwater(height));
 }
    
}
