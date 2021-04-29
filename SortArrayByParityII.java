// Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
// Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
// Return any answer array that satisfies this condition.

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int[] result = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            
            
            if(!(isEven(i) && isEven(nums[i])) && !(!isEven(i) && !isEven(nums[i]))){
                boolean check = isEven(i);
                for(int j = i; j < nums.length; j++){
                    if(check){
                        if(isEven(nums[j])){
                            result[i] = nums[j];
                            nums[j] = nums[i];
                            break;
                        }
                    }else{
                        if(!isEven(nums[j])){
                            result[i] = nums[j];
                            nums[j] = nums[i];
                            break;
                        }
                    }
                }
                
            }else{
                result[i] = nums[i];
            }
            
        }
        
        return result;
    }
    
    public boolean isEven(int num){
        return (num % 2 == 0);
    }
}
