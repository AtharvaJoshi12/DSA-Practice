// link - https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void printTopView() {
        if (root == null) {
            return;
        }

        TreeMap<Integer, Integer> topViewMap = new TreeMap<>();
        Queue<Node> queue = new LinkedList<>();
        Queue<Integer> horizontalDistances = new LinkedList<>();

        queue.add(root);
        horizontalDistances.add(0);

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            int distance = horizontalDistances.remove();

            if (!topViewMap.containsKey(distance)) {
                topViewMap.put(distance, node.data);
            }

            if (node.left != null) {
                queue.add(node.left);
                horizontalDistances.add(distance - 1);
            }

            if (node.right != null) {
                queue.add(node.right);
                horizontalDistances.add(distance + 1);
            }
        }

        for (int data : topViewMap.values()) {
            System.out.print(data + " ");
        }
    }
}
public class practice {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        /* Construct a binary tree as follows:
                    1
                  /   \
                2       3
                  \
                    4
                     \
                      5
        */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.left.right.right = new Node(5);

        System.out.println("Top view of binary tree:");
        tree.printTopView();

    }
}