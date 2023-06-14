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



    // static class Edge{
    //     int src;
    //     int dest;

    //     public Edge(int s, int d){
    //         this.src = s;
    //         this.dest = d;
    //     }
    // }

    // static void createGraph(ArrayList<Edge> graph[]){
    //     for (int i = 0; i < graph.length; i++) {
    //         graph[i] = new ArrayList<>();
    //     }


    //     //0-vertex

    //     // graph[0].add(new Edge(0, 1, 1));
    //     // graph[0].add(new Edge(0, 2, 1));

    //     // //1 vertex
    //     // graph[1].add(new Edge(1, 0, 1));
    //     // graph[1].add(new Edge(1, 3, 2));

    //     // //2nd vertex
    //     // graph[2].add(new Edge(2, 0, 1));
    //     // graph[2].add(new Edge(2, 4, 1));

    //     // //3rd vertex
    //     // graph[3].add(new Edge(3, 1, 1));
    //     // graph[3].add(new Edge(3, 4, 1));
    //     // graph[3].add(new Edge(3, 5, 1));


    //     // //4th vertex
    //     // graph[4].add(new Edge(4, 2, 1));
    //     // graph[4].add(new Edge(4, 3, 1));
    //     // graph[4].add(new Edge(4, 5, 1));


    //     // graph[5].add(new Edge(5, 3, 1));
    //     // graph[5].add(new Edge(5, 4, 1));
    //     // graph[5].add(new Edge(5, 6, 1));

    //     // graph[6].add(new Edge(6, 2, 1));

    //     // graph[0].add(new Edge(0, 1));
    //     // graph[0].add(new Edge(0, 2));
    //     // graph[0].add(new Edge(0, 3));

    //     // graph[1].add(new Edge(1, 0));
    //     // graph[1].add(new Edge(1, 2));

    //     // graph[2].add(new Edge(2, 0));
    //     // graph[2].add(new Edge(2, 1));

    //     // graph[3].add(new Edge(3, 0));
    //     // graph[3].add(new Edge(3, 4));

    //     // graph[4].add(new Edge(4, 3));

    //     // graph[0].add(new Edge(0, 1));
    //     // graph[0].add(new Edge(0, 2));

    //     // graph[1].add(new Edge(1, 0));
    //     // graph[1].add(new Edge(1, 3));

    //     // graph[2].add(new Edge(2, 0));
    //     // graph[2].add(new Edge(2, 4));

    //     // graph[3].add(new Edge(3, 1));
    //     // //graph[3].add(new Edge(3, 4));

    //     // graph[4].add(new Edge(4, 2));
    //     //graph[4].add(new Edge(4, 3));


    //     //CYCLEIN DIRECTED GRAPH
    //     // graph[0].add(new Edge(0,2));

    //     // graph[1].add(new Edge(1, 0));

    //     // graph[2].add(new Edge(2, 3));

    //     // graph[3].add(new Edge(3, 0));

    //     // graph[0].add(new Edge(0,1));
    //     // graph[0].add(new Edge(0,2));

    //     // graph[1].add(new Edge(1, 3));

    //     // graph[2].add(new Edge(2, 3));

    //     // Topological Sort Question


    //     // graph[2].add(new Edge(2, 3));

    //     // graph[3].add(new Edge(3, 1));

    //     // graph[4].add(new Edge(4, 0));
    //     // graph[4].add(new Edge(4, 1));

    //     // graph[5].add(new Edge(5, 0));
    //     // graph[5].add(new Edge(5, 2));

    //     // All paths sum question

    //     // graph[0].add(new Edge(0, 3));

    //     // graph[2].add(new Edge(2, 3));

    //     // graph[3].add(new Edge(3, 1));

    //     // graph[4].add(new Edge(4, 0));
    //     // graph[4].add(new Edge(4, 1));

    //     // graph[5].add(new Edge(5, 0));
    //     // graph[5].add(new Edge(5, 2));

    //     // Dijkstra's Algorithm

    //     // graph[0].add(new Edge(0, 1, 2));
    //     // graph[0].add(new Edge(0, 2, 4));

    //     // graph[1].add(new Edge(1, 2, 1));
    //     // graph[1].add(new Edge(1, 3, 7));

    //     // graph[2].add(new Edge(2, 4, 3));

    //     // graph[3].add(new Edge(3, 5, 1));

    //     // graph[4].add(new Edge(4, 3, 2));
    //     // graph[4].add(new Edge(4, 5, 5));

    //     // Bellman Ford Algorithm

    //     // graph[0].add(new Edge(0, 1, 2));
    //     // graph[0].add(new Edge(0, 2, 4));

    //     // graph[1].add(new Edge(1, 2, -4));
        
    //     // graph[2].add(new Edge(2, 3, 2));

    //     // graph[3].add(new Edge(3, 4, 4));

    //     // graph[4].add(new Edge(4, 1, -1));

    //     // Prims Algorithm

    //     graph[0].add(new Edge(0,1,10));
    //     graph[0].add(new Edge(0,2,15));
    //     graph[0].add(new Edge(0,3,30));

    //     graph[1].add(new Edge(1,0,10));
    //     graph[1].add(new Edge(1,3,40));

    //     graph[2].add(new Edge(2,0,15));
    //     graph[2].add(new Edge(2,3,50));

    //     graph[3].add(new Edge(3, 1, 40));
    //     graph[3].add(new Edge(3, 2, 50));


    // graph[0].add(new Edge(0,1,1));
    // graph[0].add(new Edge(0,2,2));
    // graph[0].add(new Edge(0,3,3));
    // graph[0].add(new Edge(0,4,4));

    // graph[1].add(new Edge(1,0,1));
    // graph[1].add(new Edge(1,2,5));
    // graph[1].add(new Edge(1,4,7));

    // graph[2].add(new Edge(2,0,2));
    // graph[2].add(new Edge(2,2,5));
    // graph[2].add(new Edge(2,3,6));

    // graph[3].add(new Edge(3,0,3));
    // graph[3].add(new Edge(3,2,6));

    // graph[4].add(new Edge(4,0,4));
    // graph[4].add(new Edge(4,1,7));







    //  }

    public static void createGraph(int cities[][], ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[0].length; j++) {
                if(cities[i][j] != 0){
                    graph[i].add(new Edge(i, j, cities[i][j]));
                }
                
            }
        }
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

    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!vis[i]){
                if(detectCycleUtil(graph, vis, i, -1)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par){
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // case3
            if(!vis[e.dest]){
                if(detectCycleUtil(graph, vis, e.dest, curr)){
                    return true; 
                }
               
            }

            //case1
            else if(vis[e.dest] && e.dest != par){
                return true;
            }

            //case 2 ---- do nothing
        }

        return false;
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph ){
        int[] color = new int[graph.length];

        for (int i = 0; i < color.length; i++) {
            color[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if(color[i] == -1){
                q.add(i);
                color[i] = 0;
                while (!q.isEmpty()) {
                    int curr = q.remove();

                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);

                        if(color[e.dest] == -1){
                            int nextCol = color[curr] == 0 ? 1 :0;
                            color[e.dest] = nextCol;
                            q.add(e.dest);

                        }else if(color[e.dest] == color[curr]){
                            return false;
                        }
                    }
                }

               
            }

            
        }

        return true;
    }

    public static boolean isCycleD(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if(!vis[i]){
                if(isCycleUtil(graph, i, vis, stack)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[] ){
        vis[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if(stack[e.dest]){//cycle
                return true;
            }

            if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)){
                return true;
            }
        }

        stack[curr] = false;
        return false;
    }

    public static void topologicalSort(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if(!vis[i]){
                topSortUtil(graph, i, vis, s);
            }
        }

        while (!s.isEmpty()) {
            System.out.println(s.pop()+" ");
        }

    }

    public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], Stack s){
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if(!vis[e.dest]){
                    topSortUtil(graph, e.dest, vis, s);
                }
        }

        s.push(curr);
    }
    public static void calcIndeg(ArrayList<Edge> graph[], int indeg[]){
        for (int i = 0; i < indeg.length; i++) {
            int v = i;
            for (int j = 0; j < graph[v].size(); j++) {
                Edge e = graph[v].get(i);
                indeg[e.dest]++;
            }
            
        }
    }

    public static void topSortUsingBST(ArrayList<Edge>[] graph){
            int indeg[] = new int[graph.length];
            calcIndeg(graph, indeg);
            Queue<Integer> q = new LinkedList<>();

            for (int i = 0; i < indeg.length; i++) {
                if(indeg[i] == 0){
                    q.add(i);
                }
            }

            while (!q.isEmpty()) {
                int curr = q.remove();
                System.out.print(curr+" ");

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    indeg[e.dest]--;
                    if(indeg[e.dest] == 0){
                        q.add(e.dest);
                    }
                }
            }
            System.out.println();
    }

    public static void allpathssrctodestUtil(ArrayList<Edge>[] graph, int src, int dest, String path){
        if(src==dest){
            System.out.println(path+dest);
        }


        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
                allpathssrctodestUtil(graph, e.dest, dest, path+src);
        }
    }

    static class Pair implements Comparable<Pair>{
    int n;
    int path;
    
    public Pair(int n, int path){
        this.n= n;
        this.path = path;
    }

    @Override
    public int compareTo(Pair p2){
        return this.path - p2.path;

    }
}

    public static void dijkstras(ArrayList<Edge> graph[], int src){

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[graph.length]; 
        boolean vist[] = new boolean[graph.length];

        for (int i = 0; i < dist.length; i++) {
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }  
        }

        pq.add(new Pair(src, 0));


        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vist[curr.n]){
                vist[curr.n] = true;
                System.out.print(curr.n +" ");

            for (int i = 0; i < graph[curr.n].size(); i++) {
                Edge e = graph[curr.n].get(i);
                if((e.wt + dist[e.src]) < dist[e.dest]){
                    dist[e.dest] = e.wt + dist[e.src];
                } 
                pq.add(new Pair(e.dest, dist[e.dest]));

            }
            }
           
        }

        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i]+ " ");
        }

        System.out.println();


    }

    public static void bellmanFord(ArrayList<Edge>[] graph, int src){
        int dis[] = new int[graph.length];

        for (int i = 0; i < dis.length; i++) {
            if(i != src){
                dis[i] = Integer.MAX_VALUE;
            }
        }
        int V = graph.length;
        for (int i = 0; i < V-1; i++) {
            //edges
            for (int j = 0; j < graph.length; j++) {
                for (int j2 = 0; j2 < graph[j].size(); j2++) {
                    Edge e = graph[j].get(j2);

                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dis[u] != Integer.MAX_VALUE && dis[u] + wt < dis[v]){
                        dis[v] = dis[u] + wt;
                    }
                }
            }
        }

        for (int i = 0; i < dis.length; i++) {
            System.out.print(dis[i] +" ");
        }
    }

    static class Pair2 implements Comparable<Pair2>{
        int n;
        int cost;

        public Pair2(int n, int cost){
            this.n = n;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair2 p2){
            return this.cost - p2.cost;
        }
    }

    public static void primsAlgo(ArrayList<Edge> graph[]){
        PriorityQueue<Pair2> pq = new PriorityQueue<>();
        boolean[] vis = new boolean[graph.length];

        pq.add(new Pair2(0, 0));
        int finalCost = 0;

        while(!pq.isEmpty()){
            Pair2 curr = pq.remove();

            if(!vis[curr.n]){
                vis[curr.n] = true;
                finalCost += curr.cost;
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    pq.add(new Pair2(e.dest, e.wt));

                }
            }
        }

        System.out.println(finalCost);
    }

    static class Info implements Comparable<Info>{
        int n;
        int wt;
        int stops;

        public Info(int n, int wt, int stops){
            this.n= n;
            this.stops = stops;
            this.wt = wt;
        }

        @Override
        public int compareTo(Info I2){
            return this.stops - I2.stops;
        }
    }

    public static  int cheapestFlight(int n, int graph[][], int src, int dest, int k){
        PriorityQueue<Info> pq = new PriorityQueue<>();
        int dist[] = new int[n];
        boolean vis[] = new boolean[n];
        
        for (int i = 0; i < dist.length; i++) {
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        pq.add(new Info(src, 0, 0));
        while (!pq.isEmpty()) {
            Info curr = pq.remove();
            if(curr.stops > k){
                break;
            }
                for (int i = 0; i < graph.length; i++) {
                    if(graph[i][0] == curr.n){
                        Edge e = new Edge(graph[i][0], graph[i][1], graph[i][2]);
                        if(dist[e.src] != Integer.MAX_VALUE && e.wt + curr.wt < dist[e.dest] && curr.stops <= k){
                            dist[e.dest] = e.wt + dist[e.src];
                            pq.add(new Info(e.dest, dist[e.dest], curr.stops+1));
                        }
                        
                    }
                }


           
        }

         if(dist[dest] == Integer.MAX_VALUE){
                    return -1;
                }else{
                    return dist[dest];
                }

    }


    public static int connectingCities(ArrayList<Edge>[] graph){

        // createGraph(citites, graph);

        PriorityQueue<Pair2> pq = new PriorityQueue<>();
        boolean visited[] = new boolean[graph.length];

        pq.add(new Pair2(0, 0));
        int minimumCost = 0;
        while (!pq.isEmpty()) {
            Pair2 curr = pq.remove();
            
            if(!visited[curr.n]){
                visited[curr.n] = true;
                minimumCost += curr.cost;
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    
                    pq.add(new Pair2(e.dest, e.wt));
                }
            }
        }

        return minimumCost;
    }




    
    public static void main(String args[]){    



        // 2's neighbors

        // for (int i = 0; i < graph[2].size(); i++) {
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.dest);
        // }

    //    int V = 5;
       
    //    ArrayList<Edge>[] graph = new ArrayList[V];

    //    createGraph(graph);
    //    dfs(graph, 0, new boolean[graph.length]);

    // System.out.println(hasPath(graph, 0, 10, new boolean[V]));    
    
    // topologicalSort(graph);

    //boolean vis[] = new boolean[graph.length];

    //allpathssrctodestUtil(graph, 5, 1, "");

    //dijkstras(graph, 0);

    //bellmanFord(graph, 0);

    //primsAlgo(graph);

    // int n = 4;

    // int arr[][] = {{0,1,100},
    //                 {1,2,100},
    //             {2,0,100},
    //         {1,3,600},
    //     {2,3,200}};


            // System.out.println(cheapestFlight(n, arr, 0, 3, 1));

            int cities[][] = {{0,1,2,3,4},
                            {1,0,5,0,7},
                        {2,5,0,6,0},
                    {3,0,6,0,0},
                {4,7,0,0,0}};

                int v = 5;
                
            // ArrayList<Edge>[] graph = new ArrayList[v];
            // createGraph(cities, graph);
            //primsAlgo(graph);

            ArrayList<Edge>[] graph = new ArrayList[v];

             createGraph(cities,graph);
             //primsAlgo(graph);

            System.out.println(connectingCities(graph));



    }
}
