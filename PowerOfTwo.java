// Given an integer, write a function to determine if it is a power of two.

class Solution {
    public boolean isPowerOfTwo(int n) {
        
        boolean result = true;
        if(n == 1){
            return result;
        }else if(n <= 0){
            return false;
        }
        
        int temp = n;
        while(temp > 2){
            if(temp % 2 != 0){
                return false;
            }
            temp /= 2;
        }
        return result;
    }
}
