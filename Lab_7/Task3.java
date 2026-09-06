import java.util.*;

public class Task3 {


    static int maxOutDegreeVertexMatrix(int[][] graph) {
        int n=graph.length;
        int best=-1;
        int need=-1;

        for (int i =0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                if (graph[i][j]!=0) sum++;
            }
            if(sum>need){
                 need=sum;
                 best=i;
             }
        }
  
        return best;
    }

    static int maxOutDegreeVertexList(LinkedList<LinkedList<int[]>> graph) {
         int n=graph.size();
        int best=-1;
        int need=-1;

        for (int i =0;i<n;i++){
            int sum=graph.get(i).size();
            
            if(sum>need){
                 need=sum;
                 best=i;
             }
        }
  
        return best;
         
    }


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
        {0, 0, 5, 0},
        {0, 0, 0, 1},
        {7, 0, 0, 0}
    };

    int maxDegreeMatrix = maxOutDegreeVertexMatrix(matrix);
    System.out.println("Task3a: "+maxDegreeMatrix);
    int maxWeightMatrix = weightMatrix (matrix);
    System.out.println("Task3a : "+maxWeightMatrix);
    LinkedList<LinkedList<int[]>> listGraph=new LinkedList<>();

    listGraph.add(new LinkedList<>());
    listGraph.add(new LinkedList<>());
    listGraph.add(new LinkedList<>());
    listGraph.add(new LinkedList<>());

    listGraph.get(0).add(new int[]{1, 4});
    listGraph.get(0).add(new int[]{2, 2});

    listGraph.get(1).add(new int[]{2, 5});

    listGraph.get(2).add(new int[]{3, 1});

    listGraph.get(3).add(new int[]{0, 7});

    int maxDegreeList=maxOutDegreeVertexList(listGraph);
    System.out.println("Task3b :"+maxDegreeList);

    int maxWeightList=weightList(listGraph);
    System.out.println("Task3b :"+maxWeightList);
}
}