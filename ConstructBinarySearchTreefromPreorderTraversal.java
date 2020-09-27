// Return the root node of a binary search tree that matches the given preorder traversal.
// (Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.
// Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)
// It's guaranteed that for the given test cases there is always possible to find a binary search tree with the given requirements.

class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode root = new TreeNode(preorder[0]);
        for(int i = 1; i < preorder.length; i++){
            TreeNode curr = root;
            boolean check =  true;
            while(check){
                if(preorder[i] < curr.val && curr.left != null){
                    curr = curr.left;
                }else if(preorder[i] < curr.val){
                    curr.left = new TreeNode(preorder[i]);
                    check = false;
                }else if(preorder[i] > curr.val && curr.right != null){
                    curr = curr.right;
                }else{
                    curr.right = new TreeNode(preorder[i]);
                    check = false;
                }
            }
        }
        
        return root;
    }
}
