// Given an integer array sorted in non-decreasing order, there is exactly one integer
// in the array that occurs more than 25% of the time.
// Return that integer.

class Solution {
    public int findSpecialInteger(int[] arr) {
        
        double check = arr.length;
        int result = arr[0];
        int lastNum = arr[0];
        int count = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == lastNum){
                count++;
            }else{
                if((count / check) > .25){
                    return lastNum;
                }
                lastNum = arr[i];
                count = 1;
            }
        }
        
        if((count / check) > .25){
            return lastNum;
        }
        
        return result;
    }
}
