/**
 * 验证二叉搜索树
 * 
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * 
 * 假设一个二叉搜索树具有如下特征：
 * 
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * 
 * 
 * class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * 
 * TreeNode() {
 * }
 * 
 * TreeNode(int val) {
 * this.val = val;
 * }
 * 
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

class Solution {
    TreeNode node;

    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        if (!isValidBST(root.left))
            return false;
        if (node != null && node.val >= root.val)
            return false;
        node = root;
        if (!isValidBST(root.right))
            return false;
        return true;
    }
}

