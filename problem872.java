// Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        leafs(root1, arr1);
        leafs(root2, arr2);
        return arr1.equals(arr2);
        
    }
    
    public void leafs(TreeNode root, ArrayList<Integer> arr) {
                
        boolean leafL = false;
        boolean leafR = false;
        if(root != null){
            if(root.left != null){
                leafs(root.left, arr);
            }else{
                leafL = true;
            }
            if(root.right != null){
                leafs(root.right, arr);
            }else{
                leafR = true;
            }
            if(leafL && leafR){
                arr.add(root.val);
            }
        }   
    }
}
