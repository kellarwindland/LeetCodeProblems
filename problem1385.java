// Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.
// The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int result = arr1.length;
        for(int i = 0; i < arr1.length; i++){
            int temp1 = arr1[i];
            for(int j = 0; j < arr2.length; j++){
                int temp2 = arr2[j];
                int sub = Math.abs(temp1 - temp2);
                if(sub <= d){
                    result--;
                    break;
                }
            }
        }
        return result;
    }
}
