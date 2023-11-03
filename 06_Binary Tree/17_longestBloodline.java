// Given a binary tree of size N. Your task is to complete the function sumOfLongRootToLeafPath(),
//  that find the sum of all nodes on the longest path from root to leaf node.
// If two or more paths compete for the longest path, then the path having maximum sum of nodes is being considered.

// Link - https://practice.geeksforgeeks.org/problems/sum-of-the-longest-bloodline-of-a-tree/1

class Solution{
   private int maxSum = Integer.MIN_VALUE;
   private int maxLen = 0;
    public void solve(Node root, int len, int sum) {
        if (root == null) {
            if (len > maxLen) {
                maxLen = len;
                maxSum = sum;
            } else if (len == maxLen) {
                maxSum = Math.max(sum, maxSum);
            }
            return;
        }

        sum = sum + root.data;
        solve(root.left, len + 1,  sum);
        solve(root.right, len + 1,  sum);
    }
    public int sumOfLongRootToLeafPath(Node root)
    {
        int len = 0;
        int sum = 0;

        solve(root, len, sum);

        return maxSum;
    }
}