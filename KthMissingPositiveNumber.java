// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
// Find the kth positive integer that is missing from this array.

class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int result = 0;
        int count = 0;
        int temp = 1;
        int index = 0;
        while(count < k && index < arr.length){
            if(arr[index] != temp){
                result = temp;
                count++;
            }else{
                index++;
            }
            temp++;
        }
        
        if(count < k){
            result = arr[arr.length - 1] + k - count;
        }
        
        return result;
    }
}
