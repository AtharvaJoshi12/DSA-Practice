// Detect Loop in Linked List.


public class practice {
   static Node head = new Node(2);
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void printLL(Node head){
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("null");
    }
    public static Node addFirst(int data){
        Node newNode = new Node(data);
        if (head == null)
            return newNode;

        newNode.next = head;
        head = newNode;
        return head;
    }

    public static Node addLast(int data){
        Node newNode = new Node(data);
        if (head == null)
            return newNode;

        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
        return head;
    }


    public static Node detectLoop(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return slow; // Returns where slow and fast pointers meet first time.
        }
        return null;
    }

    public static Node detectFirstNode(Node head){
        Node meet = detectLoop(head);
        Node start = head;
        while(start != meet){
            start = start.next;
            meet = meet.next;
        }
        return start;
    }


    public static void main(String[] args) {
        head = addFirst(1);
        head = addLast(3);
        printLL(head);
        head.next.next.next = head.next; // Loop
        System.out.println();
        Node Loop = detectLoop(head);
        if (Loop!=null)
            System.out.println("Loop exist");
        System.out.println( "Starting point of loop is " + detectFirstNode(head).data);

    }
}