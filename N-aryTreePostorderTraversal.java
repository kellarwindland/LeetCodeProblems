// Given an n-ary tree, return the postorder traversal of its nodes' values.
// Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).

// class Solution {
//     public List<Integer> postorder(Node root) {
//         List<Integer> result = new LinkedList<Integer>();
//         dfs(root, result);
//         return result;
//     }
//     public void dfs(Node node, List<Integer> result){
//         if(node == null){
//             return;
//         }
//         for(Node n : node.children){
//             dfs(n, result);
//         }
//         result.add(node.val);
//     }
// }

class Solution {
    public List<Integer> postorder(Node root) {
        
        List<Integer> result = new LinkedList<Integer>();
        
        if(root == null){
            return result;
        }
        
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            
            Node curr = stack.pop();
            
            for(Node n : curr.children){
                stack.push(n);
            }
            
            result.add(0, curr.val);
            
        }
        
        
        return result;
    }
    
}
