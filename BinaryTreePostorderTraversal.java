// Given the root of a binary tree, return the postorder traversal of its nodes' values.

class Solution {    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        dfs(root, result);
        
        return result;
    }
    
    public void dfs(TreeNode root, List<Integer> result){
        
        if(root == null){
            return;
        }
        
        dfs(root.left, result);
        dfs(root.right, result);
        result.add(root.val);
    }
}
