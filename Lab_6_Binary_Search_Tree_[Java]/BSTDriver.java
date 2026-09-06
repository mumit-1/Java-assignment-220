public class BSTDriver {

    public static void main(String[] args) {

        BSTNode root;

        // ========== SAMPLE INPUT 1 ==========
        //            4
        //          /   \
        //         9     2
        //        / \     \
        //       3  -5     7
        // Expected Output: false

        root = new BSTNode(4);

        root.left = new BSTNode(9);
        root.right = new BSTNode(2);

        root.left.left = new BSTNode(3);
        root.left.right = new BSTNode(-5);

        root.right.right = new BSTNode(7);

        System.out.println("Is BST? " + Task6.isBST(root));

        /*
        // ========== SAMPLE INPUT 2 ==========
        //            4
        //          /   \
        //         2     7
        //        / \     \
        //      -5   3     9
        // Expected Output: true
        */
        root = new BSTNode(4);

        root.left = new BSTNode(2);
        root.right = new BSTNode(7);

        root.left.left = new BSTNode(-5);
        root.left.right = new BSTNode(3);

        root.right.right = new BSTNode(9);

        System.out.println("Is BST? " + Task6.isBST(root));

    }
}
