//Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {

    //===================================TASK#5======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
        if(root==null) return 0;
        BSTNode l=root.left;
        BSTNode r=root.right;
        int result = sum(l,r);
        return result; 
    }
    public static Integer sum( BSTNode root1, BSTNode root2){
        if(root1==null || root2==null) return 0;
        return  root1.elem+ root2.elem+sum(root1.left,root2.left)+sum(root1.right,root2.right);
    }
    
    }
    //===============================================================



