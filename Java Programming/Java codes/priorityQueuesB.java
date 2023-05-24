import java.util.*;

public class priorityQueuesB {

    static class Student implements Comparable<Student>{ // overriding
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 13));
        pq.add(new Student("C", 1));
        pq.add(new Student("D", 9));

        while(!pq.isEmpty()){
            System.out.print(pq.peek().name +" ");
            pq.remove();
        }
    }
}
