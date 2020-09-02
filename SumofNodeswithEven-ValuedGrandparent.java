// Given a binary tree, return the sum of values of nodes with even-valued grandparent.  (A grandparent of a node is the parent of its parent, if it exists.)

class Solution {
    int sum = 0;
    public int sumEvenGrandparent(TreeNode root) {
        int h = height(root); 
        dfs(root,1,h,-1,-1);
        return sum;
    }
    
    int height(TreeNode root){
        if(root==null)
            return(0);
        int lheight = height(root.left);
        int rheight = height(root.right);
        return 1 + Math.max(lheight,rheight);
    }
    
    void dfs(TreeNode root,int level,int max, int grand, int parent){
        if(level == 1){
            if(root.left !=null)
            dfs(root.left,level+1,max, -1, root.val);
            
            if(root.right!=null)
                dfs(root.right,level+1,max, -1, root.val);
        }
        
        if(level == 2){
            if(root.left !=null)
            dfs(root.left,level+1,max, parent, root.val);
            
            if(root.right!=null)
                dfs(root.right,level+1,max, parent, root.val);
        }
        if(level > 2){
            if(grand % 2 == 0){
                sum += root.val;
            }
            
            if(root.left !=null){
                dfs(root.left,level+1,max, parent, root.val);
            }
            
            if(root.right!=null){
                dfs(root.right,level+1,max, parent, root.val);
            }
        }
            
    }
}
