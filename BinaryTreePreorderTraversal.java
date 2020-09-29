// Given the root of a binary tree, return the preorder traversal of its nodes' values.

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> result = new LinkedList<>();
        dfs(root, result);
        return result;
    }
    
    public void dfs (TreeNode root, List<Integer> result){
        
        if(root == null){
            return;
        }
        
        result.add(root.val);
        dfs(root.left, result);
        dfs(root.right, result);
    }
}
