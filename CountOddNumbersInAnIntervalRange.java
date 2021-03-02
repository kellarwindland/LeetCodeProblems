// Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).

class Solution {
    public int countOdds(int low, int high) {
        int result = (high - low) / 2;
        
        if((high % 2) == 1 || (low % 2) == 1){
            result++;
        }
        
        return result;
    }
}
