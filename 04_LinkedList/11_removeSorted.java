// Remove Duplicates From Sorted List

/********************************************************

    Following is the class structure of the Node class:
    
    class Node
    {
        public:
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
    };

********************************************************/

public class Solution {
    public static Node uniqueSortedList(Node head) {
       if(head == null)
            return null;

       Node curr = head;

       while(curr.next != null){
           if(curr.data == curr.next.data){
               // delete
               curr.next = curr.next.next;
           }
           else
               curr = curr.next;
       } 

       return head;    
    }
}