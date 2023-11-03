import java.util.*;
class TreeNode {
    int data;
    TreeNode left, right;
    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

    //     1
    //    / \
    //   2   3
    //  / \ / \
    // 4  5 6  7

public class VerticalOrderTraversal {
    public static void printVerticalOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeMap<Integer, List<Integer>> verticalMap = new TreeMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> verticalLevels = new LinkedList<>();

        queue.add(root);
        verticalLevels.add(0);

        while (!queue.isEmpty()) {
            TreeNode current = queue.remove();
            int level = verticalLevels.remove();

            if (!verticalMap.containsKey(level)) {
                verticalMap.put(level, new ArrayList<>());
            }

            verticalMap.get(level).add(current.data);

            if (current.left != null) {
                queue.add(current.left);
                verticalLevels.add(level - 1);
            }

            if (current.right != null) {
                queue.add(current.right);
                verticalLevels.add(level + 1);
            }
        }

        for (List<Integer> levelList : verticalMap.values()) {
            for (Integer data : levelList) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("Vertical Order Traversal:");
        printVerticalOrder(root);
    }
}
