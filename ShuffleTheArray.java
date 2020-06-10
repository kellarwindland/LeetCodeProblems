// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
// Return the array in the form [x1,y1,x2,y2,...,xn,yn].

class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] result = new int[nums.length];
        int index = 0;
        boolean check = true;
        for(int i = 0; i < nums.length; i++){
            if(i < n){
                result[index] = nums[i];
                index += 2;
            }else{
                if(check){
                    index = 1;
                    check = false;
                }
                result[index] = nums[i];
                index += 2;
            }
        }

        return result;
    }
}
