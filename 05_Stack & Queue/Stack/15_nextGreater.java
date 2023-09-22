// Next Greater


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Long> s = new Stack<Long>();
        s.push(-1L); // Push a long value -1L

        long ans[] = new long[n];

        for(int i = n-1; i >= 0; i--) {
            long curr = arr[i];

            while(!s.isEmpty() && s.peek() <= curr) {
                s.pop();
            }

            ans[i] = s.isEmpty() ? -1 : s.peek();
            s.push(curr);
        }

        return ans;
    } 
}