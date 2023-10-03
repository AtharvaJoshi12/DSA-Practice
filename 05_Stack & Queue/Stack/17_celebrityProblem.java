// The Celebrity Problem
// Link - https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1


class Solution
{ 
    private boolean knows(int M[][],int a , int b, int n){
        if(M[a][b]==1)
            return true;
        else
            return false;
    }
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	Stack<Integer> s = new Stack<>();
    	
    	// step 1 : Push all elements in stack
    	for(int i = 0; i<n; i++){
    	    s.push(i);
    	}
    	
    	// step 2: get 2 elements and compare them
    	
    	while(s.size()>1){
    	    int a = s.pop();
    	    int b = s.pop();
    	    
    	    if(knows(M,a,b,n))
    	        s.push(b);
    	    else
    	        s.push(a);
    	}
    	
    	int ans = s.peek();
    	
    	// step 3: single element in stack is potential celebrity so verify it
    	
    	int zeroCount = 0;
    	
    	for(int i = 0; i<n; i++){
    	    if(M[ans][i]==0)
    	        zeroCount++;    
    	}
    	
    	// all zeros
    	if(zeroCount != n )
    	    return -1;
    	    
    	// column check
    	
    	int oneCount = 0;
    	    	
    	for(int i = 0; i<n; i++){
    	    if(M[i][ans]==1)
    	        oneCount++;    
    	}
    	
    	if(oneCount!=n-1)
    	    return -1;
    	    
    	return ans;    
    }
}