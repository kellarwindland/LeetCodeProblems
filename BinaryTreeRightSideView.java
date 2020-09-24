// Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> result = new LinkedList<Integer>();
        
        if(root == null){
            return result;
        }
        
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        result.add(root.val);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> temp = new LinkedList<Integer>();
            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll();
                
                if(curr.left != null){
                    queue.add(curr.left);
                    temp.add(curr.left.val);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                    temp.add(curr.right.val);
                }
            }
            
            if(temp.size() > 0){
                result.add(temp.get(temp.size() - 1));
            }
            
        }
        
        return result;
    }
}
