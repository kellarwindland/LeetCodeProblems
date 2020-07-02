// Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

class NumArray {

    private int[] arr;
    
    public NumArray(int[] nums) {
        arr = nums;
    }
    
    public int sumRange(int i, int j) {
        int result = 0;
        for(int p = i; p <= j; p++){
            result += arr[p];
        }
        
        return result;
    }
}
