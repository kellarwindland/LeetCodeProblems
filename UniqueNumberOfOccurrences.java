// Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int temp : arr){
            if(map.get(temp) == null){
                map.put(temp, 1);
            }else{
                int val = map.get(temp);
                val++;
                map.put(temp, val);
            }
        }
        
        Set<Integer> set = new HashSet<>();
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(!set.add(entry.getValue())){
                return false;
            }
        }
        
        return true;
    }
}
