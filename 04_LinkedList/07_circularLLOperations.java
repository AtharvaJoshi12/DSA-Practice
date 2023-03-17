// Basic operations on circular linked list



public class practice {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node tail;

    public void insertNode(int element,int data){
        // empty list
        if (tail==null){
            Node newNode = new Node(data);
            tail = newNode;
            newNode.next = newNode;
        }
        else {
            // non empty list
            Node curr = tail;
            while (curr.data!=element)
                curr = curr.next;

            Node newNode = new Node(data);
            newNode.next = curr.next;
            curr.next = newNode;

        }
    }

    public void printList()
    {
        Node temp = tail;
        if (tail==null) {
            System.out.println("List is empty");
            return;
        }
        do{
            System.out.print(tail.data + " ");
            tail=tail.next;
        }while(tail!=temp);

    }

    public void deleteNode(int value)
    {
        // empty list
        if (tail==null){
            System.out.println("List is empty");
            return;
        }

        // non empty list
        else {
            Node prev = tail;
            Node curr = prev.next;

            while (curr.data!=value){
                prev = prev.next;
                curr = curr.next;
            }

            prev.next = curr.next;
            //if only 1 node in LL
            if (curr==prev) {
                tail = null;
                return;
            }

            if (tail==curr){
                tail=prev;
            }
            curr.next = null;

        }
    }

    public static void main(String[] args) {
        practice list = new practice();
        list.insertNode( 1,1000);
        list.insertNode( 1000,200);

        list.printList();
        list.deleteNode(1000);
        System.out.println();
        list.printList();
    }
}

