// LabTask2: Word Decoder
public class LabTask2 {
    
 public static Node wordDecoder(Node head) {
    if (head == null) return null;
    int length = 0;
    Node temp = head;
    while (temp != null) {
        length++;
        temp = temp.next;
    }
    int key = 13 % length;
    Node current = head;
    int index = 0;
    Node decodedHead = null;

    while (current != null) {
        if (index%key==0 && index!=0) {
            Node newNode= new Node(current.elem,null);
            newNode.next=decodedHead;
            decodedHead=newNode;
        }
        index++;
        current=current.next;
    }
    Node dum=new Node(null,decodedHead);
    return dum;
}


    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
