// Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result = new LinkedList<>();
        
        if(root == null){
            return result;
        }
        
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        
        int count = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> temp = new LinkedList<>();
            for(int i = 0; i < size; i ++){
                TreeNode curr = queue.poll();
                temp.add(curr.val);
                
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
            
            if(count % 2 == 0){
                Collections.reverse(temp);
            }
            count++;
            result.add(temp);
        }
        
        return result;
    }
}
