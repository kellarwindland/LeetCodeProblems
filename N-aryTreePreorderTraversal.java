// Given an n-ary tree, return the preorder traversal of its nodes' values.
// Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).

//class Solution {
//     public List<Integer> preorder(Node root) {
//         List<Integer> result = new LinkedList<>();
//         dfs(root, result);
//         return result;
//     }
//     public void dfs(Node root, List<Integer> result){
//         if(root == null){
//             return;
//         }
//         result.add(root.val);
//         for(Node n : root.children){
//             dfs(n, result);
//         }
//     }
// }

class Solution {
    public List<Integer> preorder(Node root) {
        
        List<Integer> result = new LinkedList<>();
        
        if(root == null){
            return result;
        }
        
        Stack<Node> order = new Stack<>();
        order.push(root);
        
        while(!order.isEmpty()){
            
            Node curr = order.pop();
            result.add(curr.val);
            
            List<Node> children = curr.children;
            
            for(int i = children.size() - 1; i >= 0; i--){
                order.push(children.get(i));
            }
            
        }
        
        
        return result;
    }
}
