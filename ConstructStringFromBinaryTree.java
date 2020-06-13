// You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.
// The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the empty parenthesis pairs that
// don't affect the one-to-one mapping relationship between the string and the original binary tree.

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
    public String tree2str(TreeNode t) {
        
        String result = "";
        String resultRight = "";
        String resultLeft = "";

        if(t == null){
            result = "";
        }else if (t.left == null && t.right == null){
            result = Integer.toString(t.val);
        }else{
            if(t.left != null){
                resultLeft = result + "(" + tree2str(t.left) + ")";
            }else{
                resultLeft = "()";
            }
            if(t.right != null){
                resultRight = result + "(" + tree2str(t.right) + ")";
            }
            
            result = t.val + resultLeft + resultRight;
        }        
        return result;
    }
}
