// Given an array nums of integers, return how many of them contain an even number of digits.

class Solution {
    public int findNumbers(int[] nums) {
        
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            int count = 0;
            while(temp != 0){
                temp /= 10;
                count++;
            }
            if(count % 2 == 0){
                result++;
            }
        }
        
        return result;
    }
}
