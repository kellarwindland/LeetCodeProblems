// Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
// Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int result = 0;
        int pre;
        if(nums.length == 0){
            return result;
        }else{
            pre = nums[0];
        }
        result++;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != pre){
                nums[result] = nums[i];
                pre = nums[i];
                result++;
            }
        }
        
        return result;
    }
}
