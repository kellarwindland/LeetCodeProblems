// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, 
// the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it
// will automatically contact the police if two adjacent houses were broken into on the same night.
// Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.



class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }else if(nums.length == 1){
            return nums[0];
        }
        
        int[] total = new int[nums.length];
        total[0] = nums[0];
        total[1] = Math.max(nums[0], nums[1]);
        
        for(int i = 2; i < nums.length; i++){
            int temp = nums[i] + total[i - 2];
            if(temp > total[i - 1]){
                total[i] = temp;
            }else{
                total[i] = total[i - 1];
            }
        }
        
        return total[total.length - 1];
    }
}
