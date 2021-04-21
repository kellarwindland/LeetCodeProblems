// You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
// Return the sum of all the unique elements of nums.

class Solution {
    public int sumOfUnique(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        Set<Integer> notSet = new HashSet<>();
        
        for(int temp : nums){
            if(!set.add(temp) || notSet.contains(temp)){
                set.remove(temp);
                notSet.add(temp);
            }
        }
        
        int result = 0;
        
        for(int temp : set){
            result += temp;
        }
        
        return result;
    }
}
