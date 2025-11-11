class task2{
  public static void main(String [] args){
      int[][] matrix = {
            {1, 3, 1},
            {6, 4, 2},
            {5, 1, 7},
            {9, 3, 3},
            {8, 5, 4}
        };
      int[] sum1= new int[matrix[0].length];
      int sum2=0;
      int sum3=0;
         for (int i=0;i<matrix.length;i++){         
            for (int j=0;j<matrix[i].length;j++){  
                sum1[j]+=matrix[i][j];  
//                System.out.print(matrix[i][j]);
            }
        }
     System.out.print(sum1[0]);
  }
}