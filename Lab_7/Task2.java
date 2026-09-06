import java.util.*;
 
public class Task2 {
 

    static int weightMatrix(int[][] graph){
        int n = graph.length;
        int best=-1;
        int need=-1;
 
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++) sum+=graph[i][j];
            if(sum>need){
                 need=sum;
                 best=i;
             }
        }
        return best;
    }
 
  
    static int weightList(LinkedList<LinkedList<int[]>> graph) {
        int n=graph.size();
        int best=-1;
        int need=-1;
 
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<graph.get(i).size();j++){
                int[] edge=graph.get(i).get(j);
                sum+=edge[1];
            }
            if(sum>need){
                 need=sum; 
                 best=i; 
            }
        }
        return best;
    }
    public static void main(String[] args){
        int[][] matrix={
            {0, 4, 2, 0},
            {4, 0, 5, 0},
            {2, 5, 0, 1},
            {0, 0, 1, 0}
        };
 
        int maxVertexMatrix=weightMatrix(matrix);
        System.out.println("Task2a: "+maxVertexMatrix);
 
        LinkedList<LinkedList<int[]>> listGraph = new LinkedList<>();

        listGraph.add(new LinkedList<>());
        listGraph.add(new LinkedList<>());
        listGraph.add(new LinkedList<>());
        listGraph.add(new LinkedList<>());

        listGraph.get(0).add(new int[]{1, 4});
        listGraph.get(0).add(new int[]{2, 2});

        listGraph.get(1).add(new int[]{0, 4});
        listGraph.get(1).add(new int[]{2, 5});  

        listGraph.get(2).add(new int[]{0, 2});
        listGraph.get(2).add(new int[]{3, 1});
        listGraph.get(2).add(new int[]{1, 5}); 
        
        listGraph.get(3).add(new int[]{2, 1});

 
        int maxVertexList = weightList(listGraph);
        System.out.println("Task2b: "+maxVertexList);
    }
}