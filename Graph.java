import java.util.*;
import java.util.ArrayList;

public class Graph{
    private int V;   //number of vertices
    private List<List<Integer>> adj;  //adjancy list


   public Graph(int V){
    this.V=V;
    adj=new ArrayList<>();
    for(int i=0;i<V;i++){
        adj.add(new ArrayList<>());
    }
}

public void addEdge(int u,int v){
    adj.get(u).add(v);
    adj.get(v).add(u); //comment this line if directed graph
}

//BFS from a given source
public void bfs(int start){
    boolean[]visited=new boolean[V];
    Queue<Integer>queue=new LinkedList<>();

    visited[start]=true;
    queue.add(start);

    System.out.println("BFS Order:");
    while(!queue.isEmpty()){
        int node=queue.poll();
        System.out.print(node + " ");

        for(int nei : adj.get(node)){
            if(!visited[nei]){
                visited[nei]=true;
                queue.add(nei);
            }
        }
    }
     System.out.println();


   }

   public static void main(String[] args) {
    Graph g=new Graph(6);
    g.addEdge(1, 3);
    g.addEdge(0, 2);
    g.addEdge(1, 4);
    g.addEdge(2, 5);

     g.bfs(4);
   }
}
