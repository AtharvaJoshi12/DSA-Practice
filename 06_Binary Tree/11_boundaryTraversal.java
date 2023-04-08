import java.lang.reflect.Array;
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

    public static void traverseLeft(Node root, ArrayList<Integer> ans){
        if ((root == null) || (root.left == null && root.right == null))
            return;
        ans.add(root.data);
        if (root.left!=null)
            traverseLeft(root.left,ans);
        else
            traverseLeft(root.right,ans);
    }

    public static void traverseLeaf(Node root, ArrayList<Integer> ans) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            ans.add(root.data);
            return;
        }
        traverseLeaf(root.left,ans);
        traverseLeaf(root.right,ans);

    }

    public static void traverseRight(Node root, ArrayList<Integer> ans){
        if ((root == null) || (root.left == null && root.right == null))
            return;
        if (root.right!=null)
            traverseRight(root.right,ans);
        else
            traverseRight(root.left,ans);

        ans.add(root.data);
    }
    public static ArrayList<Integer> boundaryTraversal (Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        // print left part
        traverseLeft(root,ans);

        // print leaf node
        // left subtree
        traverseLeaf(root.left,ans);
        // right subtree
        traverseLeaf(root.right,ans);

        // print right part
        traverseRight(root.right,ans);
        return ans;
    }




    public static void main(String[] args) {
        Node root = null;
        root = binaryTree(root);

        for(int i : boundaryTraversal(root))
            System.out.print(i + " ");

    }
}