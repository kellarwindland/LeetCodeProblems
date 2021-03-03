// Given an integer x, return true if x is palindrome integer.
// An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0){
            return false;
        }
        
        int temp = 0;
        int start = x;
        while(start > 0){
            temp *= 10;
            temp += start % 10;
            start /= 10;
        }
        
        return temp == x;
        
    }
}
