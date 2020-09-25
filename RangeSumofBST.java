// Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
// The binary search tree is guaranteed to have unique values.

class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        
        int result = 0;
        
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            
            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll();
                if((curr.val >= L) && (curr.val <= R)){
                    result += curr.val;
                }
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
        }
        
        return result;
    }
}
