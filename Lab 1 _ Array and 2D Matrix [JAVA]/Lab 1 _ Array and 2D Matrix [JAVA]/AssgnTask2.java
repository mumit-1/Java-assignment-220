//Assignment Task 02: Matrix Compression
class AssgnTask2{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer[][] compressMatrix( Integer[][] matrix ){
      int num1=0;
      int num2=0;
      int num3=0;
      int num4=0;
         for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[i].length;j++){
            if(i<=1 && j<=1){
              num1+=matrix[i][j];
            }
            else if(i<=1 && j<=3){
            num2+=matrix[i][j];
            }
            else if(i<=3 && j<=1){
            num3+=matrix[i][j];
            }
            else{
            num4+=matrix[i][j];
            }
           
          }
        }
            Integer[][] matrixA = {
            { num1 , num2 },
            { num3 , num4 },
           
        };
        //remove the line below and return the newly created Compressed 2D matrix
        return matrixA;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}
