public class Driver {
    public static void main(String[] args) {

        // Creating BTnodes
      BTNode root = new BTNode(1);
        root.left = new BTNode(2);
        root.right = new BTNode(3);
        root.left.left = new BTNode(4);
        root.left.right = new BTNode(5);
        root.right.right = new BTNode(6);
        root.left.left.left = new BTNode(7);
        root.right.right.right = new BTNode(8);

        // Example call
        System.out.println("Calling levelSum: "+ Task6.levelSum(root));
        

      
    }


}