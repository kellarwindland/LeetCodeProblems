// Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums.
// A subarray is defined as a contiguous sequence of numbers in an array.
// A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i where l <= i < r, numsi < numsi+1. Note that a subarray of size 1 is ascending.

class Solution {
    public int maxAscendingSum(int[] nums) {
        
        int result = 0;
        int temp = 0;
        
        for(int i = 0; i < nums.length - 1; i++){
            temp += nums[i]; 
            if(nums[i] >= nums[i + 1]){
                if(temp > result){
                    result = temp;
                }
                temp = 0;
            }
        }
        
        temp += nums[nums.length - 1];
        if(temp > result){ 
            result = temp;
        }
        
        return result;
    }
}
