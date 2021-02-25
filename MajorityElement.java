// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times.
// You may assume that the majority element always exists in the array.

class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        
        int result = nums[0];
        int currNumber = nums[0];
        int currCount = 0;
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] == currNumber){
                currCount++;
            }else{
                currNumber = nums[i];
                currCount = 1;
            }
            
            if(count < currCount){
                count = currCount;
                result = currNumber;
            }
        }
        
        return result;
        
    }
}
