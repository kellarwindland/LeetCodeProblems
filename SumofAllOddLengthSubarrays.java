// Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.
// A subarray is a contiguous subsequence of the array.
// Return the sum of all odd-length subarrays of arr.

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int result = 0;
        int ref = arr.length;
        int ref2 = 1;
        
        while(ref > 0){
            for(int i = 0; i < ref; i++){
                for(int j = i; j < ref2 + i; j++){
                    result += arr[j];
                }
            }
            ref -= 2;
            ref2 += 2;
        }

        return result;
    }
}
