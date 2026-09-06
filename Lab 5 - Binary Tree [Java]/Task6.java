// Complete the levelSum method
//ASSIGNMENT TASK MUST SUBMIT
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
              if(root==null)return 0;
              int need = 0;
        int l=sum(root,need);
        // int r=sum(root.right);
        return l;
    }
    public static int sum(BTNode node,int need) {
      if(node==null) return 0;
      int value=(Integer)node.elem;
      if(need%2==0){
            value*=(-1) ; 
      }
      else{

            value*=1;
      }

            return value+sum(node.left,need+1)+sum(node.right,need+1);
     //remove this line
    }
    //============================================================================

}
