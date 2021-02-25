// Find the sum of all left leaves in a given binary tree.

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumLeaf(root, false);
    }
    
    public int sumLeaf(TreeNode root, boolean check){
        int result = 0;
        
        if(root == null){
            return result;
        }
        
        if(root.left == null && root.right == null && check){
            return root.val;
        }
        
        if(root.left != null){
            result += sumLeaf(root.left, true);
        }
        
        if(root.right != null){
            result += sumLeaf(root.right, false);
        }
        
        return result;
    }
}
