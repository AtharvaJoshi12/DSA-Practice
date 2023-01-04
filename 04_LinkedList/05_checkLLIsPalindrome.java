// Check whether the LinkedList is palindrome or not.



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

    public Node findMiddle(Node head){
        Node hare = head;
        Node turtle = head;

        while (hare.next!=null && hare.next.next!=null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public Node reverse(Node head)
    {
        Node prev = null;
        Node curr = head;
        while (curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean checkLLIsPalindrome()
    {
        if (head==null || head.next == null)
            return true;

        Node middle = findMiddle(head);
        Node secondStart = reverse(middle.next);

        Node firstStart = head;
        while (secondStart!=null)
        {
            if (firstStart.data!=secondStart.data)
                return false;
            firstStart = firstStart.next;
            secondStart = secondStart.next;
        }
        return true;
    }

    public static void main(String[] args) {
        practice list = new practice();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();

        System.out.println(list.checkLLIsPalindrome());
    }
}

