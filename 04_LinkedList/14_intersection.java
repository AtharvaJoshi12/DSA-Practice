

// Given two linked lists sorted in increasing order, create a new linked list 
// representing the intersection of the two linked lists. The new linked list should
//  be made with its own memory the original lists should not be changed.


class Sol
{
    Node head;
   
    public void insertAtLast(int data)
    {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next!=null)
            currNode = currNode.next;

        currNode.next = newNode;
    }
    
    public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Sol newLL = new Sol();
        
        Node p1 = head1;
        Node p2 = head2;
        
        while(p1 != null && p2 != null){
            if(p1.data < p2.data){
                p1 = p1.next;
            }
            else if(p1.data == p2.data){
                newLL.insertAtLast(p1.data);
                p1 = p1.next;
                p2 = p2.next;
            }
            else{
                p2 = p2.next;
            }
                
        }
        
        return newLL.head; // Return the head of the new linked list
    }
}
