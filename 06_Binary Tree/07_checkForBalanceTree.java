// Check for balance tree.
// Given a binary tree, find if it is a height balanced or not. 
// A tree is height balanced if difference between heights of left and 
// right subtrees is not more than one for all nodes of tree.


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
        int height;
        TreeInfo(boolean bal, int diam){
            this.bal = bal;
            this.height = height;
        }
    }

    public static TreeInfo isBalanced(Node root){
        if (root == null)
            return  new TreeInfo(true,0);

        TreeInfo left = isBalanced(root.left);
        TreeInfo right = isBalanced(root.right);

        boolean leftAns = left.bal;
        boolean rightAns = right.bal;
        boolean diff = Math.abs(left.height-right.height) <= 1;

        TreeInfo ans = new TreeInfo(true,0);
        ans.height = Math.max(left.height,right.height)+1;

        if (leftAns && rightAns && diff){
            ans.bal = true;
        }
        else
            ans.bal = false;

        return ans;
    }



    public static void main(String[] args) {
        Node root = null;
        root = binaryTree(root);

        System.out.println(isBalanced(root).bal);

     }
}

