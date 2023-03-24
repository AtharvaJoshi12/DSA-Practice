import java.util.Scanner;

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

    public static Node buildTree(Node root){
        System.out.println("Enter Data : ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        root  = new Node(data);

        if (data == -1)
            return null;

        System.out.println("Enter data for inserting in left " + data);
        root.left = buildTree(root.left);

        System.out.println("Enter data for inserting in right " + data);
        root.right = buildTree(root.right);
        return root;
    }
    public static void main(String[] args) {
       Node root = null;
       root = buildTree(root);


    }
}

