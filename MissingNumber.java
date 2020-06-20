// Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
// find the one that is missing from the array.

class Solution {
    public int missingNumber(int[] nums) {
        
        int count = 0;
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            if(count != nums[i]){
                return count;
            }
            count++;
        }
        
        return nums[nums.length - 1] + 1;
    }
}
