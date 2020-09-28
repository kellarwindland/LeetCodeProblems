// Given two binary search trees root1 and root2.
// Return a list containing all the integers from both trees sorted in ascending order.

class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
        
        List<Integer> result = new LinkedList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        
        if(root1 != null){
            queue.add(root1);
        }
        if(root2 != null){
            queue.add(root2);
        }

        while(!queue.isEmpty()){
            int size = queue.size();
            
            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll();
                
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
                result.add(curr.val);
            }
        }
        
        Collections.sort(result);
        
        return result;
    }
}
