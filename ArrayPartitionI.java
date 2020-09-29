// Given an array of 2n integers, your task is to group these integers into n pairs of integer,
// say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

class Solution {
    public int arrayPairSum(int[] nums) {
        
        // Arrays.sort(nums);
        for (int j = 0; j < nums.length - 1; j++){ 
			for (int i = 0; i < nums.length - 1; i++) { 
				if (nums[i] > nums[i + 1]) { 
					int temp = nums[i]; 
					nums[i] = nums[i + 1]; 
					nums[i + 1] = temp; 
				} 
			} 
		} 
        
        int result = 0;
        for(int i = 0; i < nums.length - 1; i += 2){        
            result += Math.min(nums[i], nums[i + 1]);
        }
        
        return result;
    }
}
