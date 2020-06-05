// Given an array of integers, find if the array contains any duplicates.
// Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> set = new HashSet<Integer>();
        boolean check = true;
        for(int i = 0; i < nums.length; i++){
            check = set.add(nums[i]);
            if(!check){
                break;
            }
        }
        return !check;
    }
}
