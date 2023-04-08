// Determine two trees are indentical or not.

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


    public static boolean isIdentical(Node r1 , Node r2){
        if (r1 == null  && r2 == null )
            return true;
        if (r1 != null && r2 == null)
            return false;
        if (r1 == null && r2 != null)
            return false;

        boolean leftAns = isIdentical(r1.left,r2.left);
        boolean rightAns = isIdentical(r1.right,r2.right);
        boolean value = r1.data == r2.data;

        if ( leftAns && rightAns && value)
            return true;
        else
            return false;

    }



    public static void main(String[] args) {
        Node r1 = null;
        r1 = binaryTree(r1);

        Node r2 = null;
        r2 = binaryTree(r2);
        System.out.println(isIdentical(r1,r2));

     }
}

