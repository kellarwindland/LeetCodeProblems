// Given an integer array arr, return the mean of the remaining integers after removing the smallest 5% and the largest 5% of the elements.
// Answers within 10-5 of the actual answer will be considered accepted.

class Solution {
    public double trimMean(int[] arr) {
        
        Arrays.sort(arr);
        int test = arr.length / 20;
        
        double result = 0.0;
        for(int i = test; i < arr.length - test; i++){
           result += arr[i]; 
        }
        
        return (result / (arr.length - (test * 2)));
    }
}
