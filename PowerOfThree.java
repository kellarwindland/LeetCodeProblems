// Given an integer, write a function to determine if it is a power of three.

class Solution {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
