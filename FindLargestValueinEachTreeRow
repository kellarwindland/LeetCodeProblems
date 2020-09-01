// Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).

class Solution {
    public List<Integer> largestValues(TreeNode root) {
        
        List<Integer> result = new LinkedList<Integer>();
        
        if(root == null){
            return result;
        }
        
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll();
                if(curr.val > max){
                    max = curr.val;
                }
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
            result.add(max);
        }
                
        return result;
        
    }
}
