// There are n people that are split into some unknown number of groups. Each person is labeled with a unique ID from 0 to n - 1.
// You are given an integer array groupSizes, where groupSizes[i] is the size of the group that person i is in.
//For example, if groupSizes[1] = 3, then person 1 must be in a group of size 3.
// Return a list of groups such that each person i is in a group of size groupSizes[i].
// Each person should appear in exactly one group, and every person must be in a group. If there are multiple answers, return any of them.
// It is guaranteed that there will be at least one valid solution for the given input.

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> result = new LinkedList<>();
        
        for(int i = 0; i < groupSizes.length; i++){
            if(map.containsKey(groupSizes[i])){
                List<Integer> value = map.get(groupSizes[i]);
                value.add(i);
                map.put(groupSizes[i], value);
            }else{
                List<Integer> value = new LinkedList<>();
                value.add(i);
                map.put(groupSizes[i], value);
            }
        }
        
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int key = entry.getKey();
            List<Integer> value = entry.getValue();
            int end = value.size() / key;            
            for(int i = 0; i < end; i++){
                List<Integer> temp = new LinkedList<>();
                for(int j = key - 1; j >= 0; j--){
                    temp.add(value.remove(j));
                }
                result.add(temp);
            }

        }
        
        System.out.println(map.toString());
        return result;
    }
}
