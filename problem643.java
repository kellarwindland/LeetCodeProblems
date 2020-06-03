// Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value.
// And you need to output the maximum average value.

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double result = 0;
        int last = k;
        int max = 0;
        
        for(int g = 0; g < k; g++){
            max += nums[g];
        }
        for(int i = 0; i < nums.length - k + 1; i++){
            int sum = 0;
            for(int j = i; j < last; j++){
                 sum += nums[j];
            }
            last++;
            if(sum > max){
                max = sum;
            }
            
        }
        
        result = (double) max / k;
        
        return result;
    }
}
