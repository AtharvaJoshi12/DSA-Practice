// Write a function that moves the last node to the front in a given Singly Linked List.

// Examples:

// Input: 1->2->3->4->5
// Output: 5->1->2->3->4

// Input: 3->8->1->5->7->12
// Output: 12->3->8->1->5->7  

import java.util.LinkedList;


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

    public void ans(){
        Node temp1 = head;
        Node temp2 = head;
        while(temp1.next!=null){
            temp1 = temp1.next;
        }
        while(temp2.next.next!=null){
            temp2 = temp2.next;
        }

        Node newNode = temp1;
        temp2.next = null;
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        practice list = new practice();
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(1);

        list.printList();

        System.out.println("Ans:");
        list.ans();

        list.printList();

    }
}