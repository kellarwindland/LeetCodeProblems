//Given the root of a binary tree, return the average value of the nodes on each level in the form of an array.
// Answers within 10-5 of the actual answer will be accepted.

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        
        if(root == null){
            return result;
        }
        
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            double avg = 0;
            
            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll();
                avg += curr.val;
                
                if(curr.left != null){
                    queue.add(curr.left);
                }
                
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
            result.add(avg / size);
        }
        
        return result;
    }
}
