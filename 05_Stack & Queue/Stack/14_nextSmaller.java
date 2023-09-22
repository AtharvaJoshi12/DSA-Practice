// Find next smaller 

import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(-1);

        // Iterating through all the array elements from backwards.
        for (int i = n - 1; i >= 0; i--) {
			
                // Removing all the elements greater than or equal to current element from the stack.
                while (stk.peek() >= arr.get(i)) {
                        stk.pop();
                }

                // Setting the next smaller element as the element at top of stack.
                ans.add(stk.peek());

                // Pushing the current element into the stack.
                stk.push(arr.get(i));

        }

        // Returning the final vector after all the iterations.
        Collections.reverse(ans);
        return ans;
    }
}