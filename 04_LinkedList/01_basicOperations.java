

public class practice {
    private int size;

    practice(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    Node head;
    public void insertAtHead(String data)
    {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertAtLast(String data)
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

    public void deleteFirst(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
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

    public int getSize()
    {
        return size;
    }

    public void insertAtPosition(int position,String data){
       Node temp = head;
       int cnt = 1;
       Node newNode = new Node(data);

       if (position==1)
       {
           newNode.next = head;
           head = newNode;
           return;
       }
       while (cnt<position-1)
       {
           temp=temp.next;
           cnt++;
       }


       newNode.next = temp.next;
       temp.next = newNode;

    }


    public static void main(String[] args) {
        practice list = new practice();
        list.insertAtHead("aj");
        list.insertAtHead("hi");
        list.insertAtLast("bye");
        list.printList();
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        }
    }

