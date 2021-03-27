// Given an array of integers nums, you start with an initial positive value startValue.
// In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).
// Return the minimum positive value of startValue such that the step by step sum is never less than 1.

class Solution {
    public int minStartValue(int[] nums) {
        
        int result = 1;
        int total = 1;
        int index = 0;
        boolean check = true;
        
        while(check){
            total += nums[index];
            index++;
            if(total <= 0){
                index = 0;
                result++;
                total = result;
            }else if(index == nums.length){
                check = false;
            }
        }
        
        return result;
    }
}
