// Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

class Solution {
    public void moveZeroes(int[] nums) {
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[j] != 0){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                    
                }
            }
        }
        
    }
}
