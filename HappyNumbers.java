// Write an algorithm to determine if a number n is happy.
// A happy number is a number defined by the following process:
// Starting with any positive integer, replace the number by the sum of the squares of its digits.
// Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy.
// Return true if n is a happy number, and false if not.

class Solution {
    public boolean isHappy(int n) {
        
        int temp = 0;
        HashSet<Integer> set = new HashSet<>();
        boolean result = true;
        
        while(n != 1){
            while(n > 0){
                temp += Math.pow((n % 10), 2);
                n /= 10;
            }
            
            if(!set.add(temp)){
                result = false;
                break;
            }
            
            n = temp;
            temp = 0;
        }
        
        return result;
    }
}
