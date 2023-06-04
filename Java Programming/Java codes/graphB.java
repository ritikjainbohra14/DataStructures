import java.util.*;

public class graphB {
    static class Edge{
        int src;
        int dest;
        int wt;

       public Edge(int s, int d, int w){
        this.src = s;
        this.dest = d;
        this.wt = w;
       }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }


        //0-vertex

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        //1 vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 2));

        //2nd vertex
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        //3rd vertex
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));


        //4th vertex
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));


        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 2, 1));
    }

    public static void bfs(ArrayList<Edge>[] graph ){
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < vis.length; i++) {
            if(!vis[i]){
                bfsUtil(graph, vis);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge>[] graph, boolean visted[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(0); // source

        while (!q.isEmpty()) {
            int curr = q.remove();

            if(!visted[curr]){
                visted[curr] = true;
                System.out.print(curr +" ");
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph){

        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
           dfsUtil(graph, i, vis);
        }

    }

    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean visted[]){
        System.out.print(curr+ " ");
        visted[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if(!visted[e.dest]){
                dfsUtil(graph, e.dest, visted);
            }
        }
        
    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean visted[]){
        if(src == dest){
            return true;
        }

        visted[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);

            if(!visted[e.dest] && hasPath(graph, e.dest, dest, visted)){
                return true;
            }
        }

        return false;
    }
    
    public static void main(String args[]){    



        // 2's neighbors

        // for (int i = 0; i < graph[2].size(); i++) {
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.dest);
        // }

       int V = 7;
       
       ArrayList<Edge>[] graph = new ArrayList[V];

       createGraph(graph);
    //    dfs(graph, 0, new boolean[graph.length]);

    System.out.println(hasPath(graph, 0, 10, new boolean[V]));    
    
    



    }
}
