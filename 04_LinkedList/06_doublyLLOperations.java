
// Basic operations on doubly linked list


public class practice {
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;

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

    public void insertAtHead(int data)
    {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void insertAtLast(int data)
    {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next!=null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        newNode.prev = currNode;

    }


    public void insertAtPosition(int position,int data){
        Node temp = head;
        int cnt = 1;
        Node newNode = new Node(data);

        if (position==1)
        {
            insertAtHead(data);
            return;
        }
        while (cnt<position-1)
        {
            temp=temp.next;
            cnt++;
        }

        if (temp.next==null)
        {
            insertAtLast(data);
            return;
        }


        newNode.next = temp.next;
        temp.next.prev = newNode;

        temp.next = newNode;
        newNode.prev = temp;

    }

    public void deleteFirst(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void deleteLast(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public void deleteAtPosition(int position){
        Node temp = head;
        int cnt = 1;
        if (head == null){
            System.out.println("List is empty");
            return;
        }

        if (position==1)
        {
            deleteFirst();
            return;
        }
        if (temp.next==null)
        {
            temp.prev.next=null;
            return;
        }

        while (cnt<position)
        {
            temp=temp.next;
            cnt++;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

    }
    public static void main(String[] args) {
        practice list = new practice();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtLast(5);
        list.insertAtLast(1);
        list.printList();
        list.deleteAtPosition(2);
        list.printList();
    }
}

