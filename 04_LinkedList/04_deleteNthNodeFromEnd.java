// Delete Nth node from end of the linked list.



public class practice {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data)
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

    public void printList()
    {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode!=null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void deleteNthNodeFromEnd(int n)
    {
        if (head.next==null)
            return;

        // size
        int size = 0;
        Node currNode = head;
        while (currNode!=null) {
            currNode = currNode.next;
            size++;
        }
        
        if (n == size)
        {
            head = head.next;
            return;
        }

       int indexToSearch = size-n;
        Node prevNode = head;
        int i = 1;
        while (i<indexToSearch)
        {
            prevNode = prevNode.next;
            i++;
        }
        prevNode.next = prevNode.next.next;
    }

    public static void main(String[] args) {
        practice list = new practice();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
        list.deleteNthNodeFromEnd(4);
        list.printList();
    }
}

