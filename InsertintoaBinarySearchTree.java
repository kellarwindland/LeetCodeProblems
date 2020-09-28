// Given the root node of a binary search tree (BST) and a value to be inserted into the tree, insert the value into the BST.
// Return the root node of the BST after the insertion.
// It is guaranteed that the new value does not exist in the original BST.
// Note that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        if(root == null){
            root = new TreeNode(val);
            return root;
        }
        
        TreeNode curr = root;
        while(curr != null){
            if(curr.val < val && curr.right != null){
                curr = curr.right;
            }else if(curr.val < val){
                curr.right = new TreeNode(val);
                curr = null;
            }else if(curr.val > val && curr.left != null){
                curr = curr.left;
            }else{
                curr.left = new TreeNode(val);
                curr = null;
            }
        }
        
        return root;
    }
}
