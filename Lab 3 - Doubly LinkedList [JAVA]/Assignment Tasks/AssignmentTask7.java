public class AssignmentTask7 {

    //SUBMIT ONLY THIS METHOD
    public static void rangeMove(DNode dh, int start, int end) {
        DNode x1 = dh.next;
        DNode x2 = dh.prev;
        while(x1!=dh){


          // if(x1==x2) break; 
        DNode a1=x1.next;
        
       
        int n =(int) x1.elem;
        if(n>=start && n<=end){
          DNode c1 = x1.next;
          DNode c2 = x1.prev;
       
        
          
          
          x1.prev.next=c1;
          x1.next.prev=c2;
           
          DNode last = dh.prev; // last = 4 
          x1.prev=last;
          x1.next=dh;
          last.next=x1;
          dh.prev=x1;
        }
        
        x1=a1;
        }
    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {5, 3, 7, 1, 9, 6, 2, 4};
        DNode dh = LinkedListHelpers.createDummyHeadedDoublyLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);

        System.out.println("\nExpected Output:");
        Object[] expected = {3, 1, 9, 2, 4, 5, 7, 6};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);
        
        //Running the Range Move with [5,7] range 
        rangeMove(dh, 5, 7);
        //Printing after Range Move
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);
    }
}
