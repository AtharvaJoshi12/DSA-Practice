
Node kReverse(Node head, int k) {
    //base call
    if(head == null) {
        return null;
    }
    
    //step1: reverse first k nodes
    Node next = null;
    Node curr = head;
    Node prev = null;
    int count= 0;
    
    while( curr != null && count < k ) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        count++;
    }
    
    //step2: Recursion dekhlega aage ka 
    if(next != null) {
        head.next = kReverse(next,k);
    }
    
    //step3: return head of reversed list
    return prev;
}