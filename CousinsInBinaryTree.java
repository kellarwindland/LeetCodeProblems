// In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
// Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
// We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
// Return true if and only if the nodes corresponding to the values x and y are cousins.

class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        
        boolean result = false;
        
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int parentX = root.val;
        int parentY = root.val;
        while(!queue.isEmpty()){
            int size = queue.size();
            Deque<Integer> tempQ = new ArrayDeque<>();
            for(int i = 0; i < size; i++){
                
                TreeNode temp = queue.poll();
                if(temp.left != null){
                    tempQ.add(temp.left.val);
                    if(temp.left.val == x || temp.left.val == y){
                        parentX = temp.val;
                    }
                    queue.add(temp.left);
                }
                
                if(temp.right != null){
                    tempQ.add(temp.right.val);
                    if(temp.right.val == y || temp.right.val == x){
                        parentY = temp.val;
                    }
                    queue.add(temp.right);
                }
            }
            
            
            if(tempQ.contains(x) && tempQ.contains(y) && (parentY != parentX)){
                result = true;
                break;
            }
        }
        
        return result;
        
    }
}
