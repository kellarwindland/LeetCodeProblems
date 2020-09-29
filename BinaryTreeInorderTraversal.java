// Given the root of a binary tree, return the inorder traversal of its nodes' values.

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> result = new LinkedList<>();
        dfs(root, result);
        return result;
    }
    
    public void dfs(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }
        
        dfs(root.left, result);
        result.add(root.val);
        dfs(root.right, result);
    }
}
