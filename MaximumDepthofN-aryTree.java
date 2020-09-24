// Given a n-ary tree, find its maximum depth.
//The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
// Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value

class Solution {
    public int maxDepth(Node root) {
        
        int result = 0;
        
        if(root == null){
            return result;
        }
                
        Deque<Node> queue = new ArrayDeque<Node>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            
            for(int i = 0; i < size; i++){
                Node curr = queue.poll();
                List<Node> childrens = curr.children;
                for(int j = 0; j < childrens.size(); j++){
                    queue.add(childrens.get(j));
                }
            }
            result++;
        }    
        
        return result;
    }
}
