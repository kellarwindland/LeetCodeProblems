// In a given integer array nums, there is always exactly one largest element.
// Find whether the largest element in the array is at least twice as much as every other number in the array.
// If it is, return the index of the largest element, otherwise return -1.

class Solution {
    public int dominantIndex(int[] nums) {
        
        int largest = 0;
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(largest < nums[i]){
                largest = nums[i];
                index = i;
            }
        }
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] * 2 > largest){
                return -1;
            }
        }
        
        return index;
    }
}
