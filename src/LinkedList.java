public class LinkedList {
    public static class Node {
        //it will have val and memory address of next element
        int val;
        Node next;

        public Node(int x){
            val=x;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(2);
        Node second=new Node(3);
        Node third=new Node(5);
        head.next=second; //making connection
        second.next=third;
        // head-->second-->third with next reference/pointer
        //System.out.println(head.val); //this is object so head.val
        //Printing/Traversing the Lonked List
        Node temp=head;
        /*while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }*/
        //we can't access the next of null
        // System.out.println(temp.val); //right now temp=null hence will  give error


        //Length of the Linked List

        // Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("The length of linked List: "+count);

        //Insert a element in front of linkedList
        //2-->3--->5
        //1-->2-->3-->5

        Node n=new Node(1); //inserting new node
        n.next=head; //pointing new node's next to head
        head=n;
        temp=head;
       /* while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }*/


        //Insert a element in end of linkedList
        //1--->2--3--->5
        //1-->2-->3-->5-->6

        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(6);
       /* while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }*/

        //Remove the first element from the linked List
        head=head.next;
        /*temp=head;
         while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }*/

        //Remove the last element from the LinkedList
        //2--->3--->5-->6
        temp=head;
        Node prev=null; //One pointer before the last we need
        while(temp.next!=null){
            prev=temp; //at last prev=5
            temp=temp.next;
        }
        prev.next=null;
        temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }





    }
}
