// Given an array arr, replace every element in that array with the greatest element among the elements to its right,
// and replace the last element with -1.
// After doing so, return the array.

class Solution {
    public int[] replaceElements(int[] arr) {
        
        int[] result = new int[arr.length];
        
        
        for(int i = 0; i < arr.length - 1; i++){
            int max = arr[i + 1];
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            result[i] = max;
        }
        
        result[arr.length - 1] = -1;
        
        return result;
        
    }
}
