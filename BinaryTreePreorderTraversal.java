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

// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
        
//         List<Integer> result = new LinkedList<>();
//         if(root == null){
//             return result;
//         }
//         Stack<TreeNode> stack = new Stack<>();
//         stack.push(root);
        
//         while(!stack.isEmpty()){
//             TreeNode curr = stack.pop();
//             result.add(curr.val);
            
//             if(curr.right != null){
//                 stack.push(curr.right);
//             }
//             if(curr.left != null){
//                 stack.push(curr.left);
//             }
//         }
        
//         return result;
//     }

// }
