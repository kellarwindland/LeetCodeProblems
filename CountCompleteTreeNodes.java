// Given a complete binary tree, count the number of nodes.

class Solution {
    public int countNodes(TreeNode root) {
        
        int result = 1;
        if(root == null){
            return 0;
        }
        if(root.left != null){
            result += countNodes(root.left);
        }
        if(root.right != null){
            result += countNodes(root.right);
        }
        
        return result;
    }
}
