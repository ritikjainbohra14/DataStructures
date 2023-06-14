import java.sql.Array;
import java.util.*;

import javax.crypto.MacSpi;


public class disjointSet {

    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt= w;
        }

        @Override
        public int compareTo(Edge e2){
            return this.wt - e2.wt;
        }
    }

    static void createGraph(ArrayList<Edge> edges){
        //edges
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }

    static int n = 4;//vertices
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init(){
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    public static int find(int x){
        if(par[x] == x){
            return x;
        }

        return par[x] = find(par[x]);
    }

    public static void union(int u, int v){
        int parU = find(u);
        int parV = find(v);

        if(rank[parU] == rank[parV]){
            par[parV] = parU;
        }else if(rank[parU] > rank[parV]){
            par[parV] = parU;
        }else{
            par[parU] = parV;
        }
    }

    public static void  kruskalsMST(ArrayList<Edge> edges, int V){
        init();
        Collections.sort(edges);
        int minMST = 0;
        int count = 0; // how many edges i have added in MST

        for (int i = 0; count < V-1; i++) {
            Edge e = edges.get(i);
            int parA = find(e.src);
            int parB = find(e.dest);

            if(parA != parB){
                union(e.src, e.dest);
                minMST += e.wt;
                count++;
            }
        }
        System.out.println(minMST);
    }

    public static void main(String args[]){
        // init();
        // union(1,3);
        // System.out.println(find(3));
        // union(2, 4);
        // union(3, 6);
        // union(1, 4);
        // System.out.println(find(3));
        // System.out.println(find(4));

        // union(1, 5);

        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();

        createGraph(edges);
        kruskalsMST(edges, V);
    }

}
