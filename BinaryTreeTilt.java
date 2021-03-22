// Given the root of a binary tree, return the sum of every tree node's tilt.
// The tilt of a tree node is the absolute difference between the sum of all left subtree node values and all right subtree node values.
// If a node does not have a left child, then the sum of the left subtree node values is treated as 0.
// The rule is similar if there the node does not have a right child.

class Solution {
    
    private int result = 0;
    
    public int findTilt(TreeNode root) {
        dfs(root, 0, 0);
        return result;
    }
    
    public int dfs(TreeNode root, int left, int right){
        
        if(root == null){
            return 0;
        }
        
        int temp = root.val;
        
        if(root.left != null){
            left += dfs(root.left, 0, 0);
        }
        
        if(root.right != null){
            right += dfs(root.right, 0, 0);
        }
        
        if(root.left == null && root.right == null){
            root.val = 0;
            return temp;
        }
        
        temp = root.val;
        root.val = Math.abs(right - left);
        result += root.val;
        return temp + right + left;
    }
}
