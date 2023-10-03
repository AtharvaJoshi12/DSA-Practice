// Reverse First K elements of Queue


class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        
        Stack<Integer> s = new Stack();
        
        for(int i = 0; i<k;i++){
            s.push(q.remove());
        }
        
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        
        int t = q.size() - k;
        
        while(t-->0){
            int val = q.remove();
            q.add(val);
        }
        
        return q;
    }
}