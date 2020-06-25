// Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
// prove that at least one duplicate number must exist.
// Assume that there is only one duplicate number, find the duplicate one.

class Solution {
    public int findDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                return nums[i];
            }
        }
        
        return -1;
    }
}
