public class AssignmentTask6 {

    //SUBMIT ONLY THIS METHOD
    public static void pairJoin(DNode dh1, DNode dh2) {
        DNode s1=dh1.next;
        DNode s2=dh2.next;

        while(s1!=null && s2!=null){
            DNode a1=s1.next;
            DNode a2=s2.next;
           

            s1.next=s2;
            s2.prev=s1;
            if(a1!=null){
              s2.next=a1;
              a1.prev=s2;
            }
            else{
              s2.next=dh1;
              dh1.prev=s2;
            }
            
            s1=a1;
            s2=a2;
            
            
        }
        
    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] list1 = {"A", "B", "C", "D"};
        Object[] list2 = {"E", "F", "G", "H"};

        DNode dh1 = LinkedListHelpers.createDummyHeadedDoublyLL(list1, false);
        DNode dh2 = LinkedListHelpers.createDummyHeadedDoublyLL(list2, false);

        System.out.println("Given Linked List 1:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh1);

        System.out.println("Given Linked List 2:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh2);

        System.out.println("\nExpected Output:");
        Object[] expected = {"A", "E", "B", "F", "C", "G", "D", "H"};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);

        //Running the Pair Join
        pairJoin(dh1, dh2);
        //Printing after Pair Join
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh1);
    }
}
