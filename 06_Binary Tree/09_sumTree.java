// Given a binary tree. Return true if, for every node X in the 
// tree other than leaves, its value is equal to the sum of its left 
// subtree's value and its right subtree's value. Else return false.

import java.util.*;

public class practice {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static Node binaryTree(Node root){
        System.out.println("Enter data : ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        root = new Node(data);

        if (data == -1)
            return null;

        System.out.println("Enter data for inserting in left " + data);
        root.left = binaryTree(root.left);
        System.out.println("Enter data for inserting in right " + data);
        root.right = binaryTree(root.right);

        return root;
    }

    static class TreeInfo{
        boolean bal;
        int sum;
        TreeInfo(boolean bal, int sum){
            this.bal = bal;
            this.sum = sum;
        }
    }

    public static TreeInfo isSumTree(Node root){
        if (root == null)
            return  new TreeInfo(true,0);

        if(root.left == null && root.right == null)
            return  new TreeInfo(true, root.data);


        TreeInfo leftAns = isSumTree(root.left);
        TreeInfo rightAns = isSumTree(root.right);

        boolean isLeftSumTree = leftAns.bal;
        boolean isRightSumTree = rightAns.bal;

        boolean condition = root.data == leftAns.sum + rightAns.sum;

        TreeInfo ans = new TreeInfo(true,0);


        if (isLeftSumTree && isRightSumTree && condition){
            ans.bal = true;
            ans.sum = root.data + leftAns.sum + rightAns.sum;
        }
        else
            ans.bal = false;

        return ans;
    }



    public static void main(String[] args) {
        Node root = null;
        root = binaryTree(root);

        System.out.println(isSumTree(root).bal);

    }
}