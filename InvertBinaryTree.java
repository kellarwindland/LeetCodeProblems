// Invert a binary tree.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        if(root != null){
            TreeNode left;
            TreeNode right;
            int rootVal = root.val;
            if(root.left != null || root.right != null){
                if(root.left != null){
                    left = invertTree(root.left);
                }else{
                    left = null;
                }

                if(root.right != null){
                    right = invertTree(root.right);
                }else{
                    right = null;
                }

                TreeNode result = new TreeNode(rootVal, right, left);

                return result;
            }
        }
                
        return root;
        
    }
}
