package solutions.tree;

import solutions.Solution;

/**
 * The {@code BalancedBinaryTree} class checks whether a binary tree
 * is height-balanced.
 * <p>
 * Link: <a href="https://leetcode.com/problems/balanced-binary-tree/description">
 * https://leetcode.com/problems/balanced-binary-tree/description</a>
 */
public class BalancedBinaryTree implements Solution {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
     }



    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    private int height(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }

    @Override
    public void run() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2)
        );
        System.out.println("Is tree balanced? " + isBalanced(root));
    }
}
