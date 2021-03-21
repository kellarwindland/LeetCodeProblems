// You are given the root of a binary tree where each node has a value 0 or 1.  Each root-to-leaf path represents a binary number starting with the most significant bit. 
// For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
// For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.
// Return the sum of these numbers. The answer is guaranteed to fit in a 32-bits integer.

class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, "", 0);
    }
    
    public int dfs(TreeNode root, String num, int total){
        
        if(root == null){
            return total;
        }
        
        if(root.left != null){
            num += root.val;
            total += dfs(root.left, num, 0);
            num = num.substring(0, num.length() - 1);
                        
        }
        
        if(root.right != null){
            num += root.val;
            total += dfs(root.right, num, 0);
            num = num.substring(0, num.length() - 1);
        }
        
        if(root.left == null && root.right == null){
            num += root.val;
            System.out.println(num);
            total += Integer.parseInt(num, 2);
        }
        
        return total;
    }
}
