


public class Solution {
    public static void insertAtTail(Node tail, Node curr ) {
    tail.next = curr;
    tail = curr;
    }
	public static Node sortList(Node  head) {
    Node zeroHead = new Node(-1);
    Node zeroTail = zeroHead;
    Node oneHead = new Node(-1);
    Node oneTail = oneHead;
    Node twoHead = new Node(-1);
    Node twoTail = twoHead;
    
    Node curr = head;
    
    // create separate list 0s, 1s and 2s
    while(curr != null) {
        
        int value = curr.data;
        
        if(value == 0) {
            insertAtTail(zeroTail, curr);
        }
        else if(value == 1) {
            insertAtTail(oneTail, curr);
        }
        else if(value == 2) {
            insertAtTail(twoTail, curr);
        }       
        curr = curr.next;
    }
    
    //merge 3 sublist
    
    // 1s list not empty
    if(oneHead.next != null) {
        zeroTail.next = oneHead.next;
    }
    else {
        //1s list -> empty
        zeroTail.next = twoHead.next;
    } 
    
    oneTail.next = twoHead.next;
    twoTail.next = null;
    
	//setup head 
    head = zeroHead.next;
    
    //delete dummy nodes
    zeroHead.next = null;
    oneHead.next = null;
    twoHead.next = null;
    
    return head;
	}
}