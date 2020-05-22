// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        
        int[] result = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            int otherHalf = target - nums[i];
            if(map.containsKey(otherHalf) && map.get(otherHalf) != i){
                result[0] = i;
                result[1] = map.get(otherHalf);
                return result;
            }
            
        }
        
        return result;
        
    }
}
