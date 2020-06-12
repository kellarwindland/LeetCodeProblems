// Given an array of integers that is already sorted in ascending order,
// find two numbers such that they add up to a specific target number.
// The function twoSum should return indices of the two numbers such that they add up to the target,
// where index1 must be less than index2.
// Note:
// Your returned answers (both index1 and index2) are not zero-based.
// You may assume that each input would have exactly one solution and you may not use the same element twice.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < numbers.length; i++){
            map.put(numbers[i], i);
        }
        
        int[] result = new int[2];
        for(int i = 0; i < numbers.length; i++){
            int temp = target - numbers[i];
            if(map.containsKey(temp)){
                result[0] = i + 1;
                result[1] = map.get(temp) + 1;
                return result;
            }
        }
        
        return result;
    }
}
