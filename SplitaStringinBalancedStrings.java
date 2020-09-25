// Balanced strings are those who have equal quantity of 'L' and 'R' characters.
// Given a balanced string s split it in the maximum amount of balanced strings.
// Return the maximum amount of splitted balanced strings.

class Solution {
    public int balancedStringSplit(String s) {
        
        int balance = 0;
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            char index = s.charAt(i);
            if(index == 'L'){
                balance += 1;
            }else{
                balance -= 1;
            }
            
            if(balance == 0){
                result += 1;
            }
        }
        
        return result;
    }
}
