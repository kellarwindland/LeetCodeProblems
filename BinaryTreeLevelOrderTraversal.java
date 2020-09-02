// Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        
        if(root == null){
            return result;
        }
        
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> temp = new LinkedList<Integer>();
            
            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll();
                temp.add(curr.val);
                
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
            result.add(temp);
        }
        return result;
    }
}
