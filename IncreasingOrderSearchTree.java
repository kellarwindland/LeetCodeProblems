// Given a binary search tree, rearrange the tree in in-order so 
// that the leftmost node in the tree is now the root of the tree, and every node has no left child and only 1 right child.

class Solution {

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        dfs(root, list);
        
        TreeNode result = new TreeNode(list.get(0));
        TreeNode curr = result;
        for(int i = 1; i < list.size(); i++){
            TreeNode temp = new TreeNode(list.get(i));
            curr.right = temp;
            curr = temp;
        }
        
        return result;
    }
    
    public void dfs(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }
        dfs(node.left, list);
        list.add(node.val);
        dfs(node.right, list);
        return;
    }
}
