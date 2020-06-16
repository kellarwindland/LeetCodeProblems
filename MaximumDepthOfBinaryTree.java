// Given a binary tree, find its maximum depth.
// The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
// Note: A leaf is a node with no children.

class Solution {
    public int maxDepth(TreeNode root) {
        
        if(root == null){
            return 0;
        }
        
        int result = 1;
        int right = 0;
        int left = 0;
        if(root.left != null){
            left = maxDepth(root.left);
        }
        if(root.right != null){
            right = maxDepth(root.right);
        }
        
        if(left > right){
                result += left;
        }else{
            result += right;
        }
        
        return result;
    }
}
