// Given an n-ary tree, return the level order traversal of its nodes' values.

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        
        if(root == null){
            return result;
        }
        
        Deque<Node> queue = new ArrayDeque<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> temp = new ArrayList<Integer>();
            for(int i = 0; i < size; i++){
                Node curr = queue.poll();
                temp.add(curr.val);
                List<Node> temp2 = curr.children;
                for(int j = 0; j < temp2.size(); j++){
                    if(temp2.get(j) != null){
                        queue.add(temp2.get(j));
                    }
                }
            }
            result.add(temp);
        }
        return result;
    }
}
