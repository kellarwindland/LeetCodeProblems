// Given the array of integers nums, you will choose two different indices i and j of that array.
// Return the maximum value of (nums[i]-1)*(nums[j]-1).

class Solution {
    public int maxProduct(int[] nums) {
        
        int max1 = nums[0];
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(max1 < nums[i]){
                max1 = nums[i];
                index = i;
            }
        }
        
        int max2 = nums[0];
        int index2 = 0;
        boolean check = true;
        for(int j = 0; j < nums.length; j++){
            
            if(index != j){
                
                if(check){
                    max2 = nums[j];
                    check = false;
                }

                if(max2 < nums[j] && index != j){
                    max2 = nums[j];
                }
            }
        }
        
        return (max1 - 1) * (max2 - 1);
        
    }
}
