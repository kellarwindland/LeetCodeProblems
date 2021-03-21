// Given a positive integer num consisting only of digits 6 and 9.
// Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).

class Solution {
    public int maximum69Number (int num) {
        
        int result = 0;
        int temp = num;
        boolean check = true;
        
        while(temp > 0){
            int digit = temp % 10;
            result *= 10;
            result += digit;
            temp /= 10;
        }
        temp = result;
        result = 0;
        while(temp > 0){
            int digit = temp % 10;
            
            if(digit == 6 && check){
                digit = 9;
                check = false;
            }
            result *= 10;
            result += digit;
            
            temp /= 10;
        }
        
        return result;
    }
}
