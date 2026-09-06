import java.util.*;

public class Task4 {


    static int[][] directedToUndirectedMatrix(int[][] graph) {
        int n = graph.length;
        int[][] newMatx=new int[n][n];
        int need=1;
        for (int i=0;i<n;i++){
            for (int j=i+need;j<n;j++){
                if (graph[i][j]!=0 || graph[j][i]!=0){
                    int w=graph[i][j]+graph[j][i];
                    newMatx[i][j]=w;
                    newMatx[j][i]=w;
                }
            }
            need++;
        }
        return newMatx;
    }

    static LinkedList<LinkedList<int[]>> directedToUndirectedList(LinkedList<LinkedList<int[]>> graph) {
        int n=graph.size();
        int[][] needX1=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<graph.get(i).size();j++){
                int[] edge=graph.get(i).get(j);
                int v=edge[0];
                int w=edge[1];
                needX1[i][v]+=w;
            }
        }

        LinkedList<LinkedList<int[]>> undirected=new LinkedList<>();
        for(int i=0;i<n;i++) undirected.add(new LinkedList<>());

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int w=needX1[i][j]+needX1[j][i];
                if(w!=0){
                    undirected.get(i).add(new int[]{j, w});
                    undirected.get(j).add(new int[]{i, w});
                }
            }
        }
        return undirected;
    }

    public static void main(String[] args){

        int[][] matrix={
            {0, 4, 2, 0},
            {3, 0, 0, 0},
            {0, 0, 0, 1},
            {0, 0, 1, 0}
        };

        int[][] undirectedMatrix=directedToUndirectedMatrix(matrix);
        System.out.println("Task4a - Undirected Matrix:");
        for (int[] row : undirectedMatrix) System.out.println(Arrays.toString(row));

        LinkedList<LinkedList<int[]>> listGraph = new LinkedList<>();

        listGraph.add(new LinkedList<>());
        listGraph.add(new LinkedList<>());
        listGraph.add(new LinkedList<>());
        listGraph.add(new LinkedList<>());

        listGraph.get(0).add(new int[]{1, 4});
        listGraph.get(0).add(new int[]{2, 2});

        listGraph.get(1).add(new int[]{0, 3});

        listGraph.get(2).add(new int[]{3, 1});

        listGraph.get(3).add(new int[]{2, 1});

        LinkedList<LinkedList<int[]>> undirectedList = directedToUndirectedList(listGraph);
        System.out.println("Task4b - Undirected List:");
        for (int i = 0; i < undirectedList.size(); i++) {
            System.out.print(i + ": ");
            for (int[] e : undirectedList.get(i)) System.out.print("(" + e[0] + "," + e[1] + ") ");
            System.out.println();
        }
    }
}