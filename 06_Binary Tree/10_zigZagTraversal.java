//      1
//     / \
//    2   3
//       / \
//      4   5

// So for the above tree answer should be - 1  3  2  4  5


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

    public static ArrayList<Integer> zigZagTraversal (Node root){
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        boolean leftToRight = true;
        while (!q.isEmpty()){
            int size = q.size();
            int [] ans = new int[size];
            for (int i = 0;i<size;i++){
                Node frontNode = q.remove();

                int index = leftToRight ? i : size - i - 1;
                ans[index] = frontNode.data;

                if (frontNode.left != null)
                    q.add(frontNode.left);

                if (frontNode.right!=null)
                    q.add(frontNode.right);

            }

            // change the direction
            leftToRight = !leftToRight;

            for (int i : ans){
                System.out.print(i + " ");
            }
        }
        return result;
    }




    public static void main(String[] args) {
        Node root = null;
        root = binaryTree(root);

        for(int i : zigZagTraversal(root))
            System.out.println(i);

    }
}