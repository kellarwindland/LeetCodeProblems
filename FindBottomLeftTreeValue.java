// Given a binary tree, find the leftmost value in the last row of the tree.

class Solution {
    public int findBottomLeftValue(TreeNode root) {
        
        int result = root.val;
        
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            boolean check = true;
            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll();
                if(curr.left != null){
                    queue.add(curr.left);
                    if(check){
                        result = curr.left.val;
                        check = false;
                    }
                }
                if(curr.right != null){
                    queue.add(curr.right);
                    if(curr.left == null){
                        result = curr.right.val;
                    }
                }
            }
            
        }
        
        return result;
        
    }
}
