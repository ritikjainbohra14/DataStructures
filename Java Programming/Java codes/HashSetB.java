import java.util.*;

public class HashSetB {
    
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();
        LinkedHashSet<Integer> linkedset = new LinkedHashSet<>();
        TreeSet<Integer> linkedset1 = new TreeSet<>();

        linkedset1.add(1);
        linkedset1.add(3);
        linkedset1.add(4);
        linkedset1.add(6);

        linkedset.add(1);
        linkedset.add(3);
        linkedset.add(4);
        linkedset.add(6);

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(9);
        set.add(8);

        // Iterator it = set.iterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        for (Integer num : set) {
            System.out.println(num );
        }

        for (Integer iterable_element : linkedset) {
            System.out.println(iterable_element);
        }

        for (Integer iterable_element : linkedset1) {
            System.out.println(iterable_element);
        }

        


    }
}
