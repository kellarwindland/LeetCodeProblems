// Given a string columnTitle that represents the column title as appear in an Excel sheet, return its corresponding column number.

class Solution {
    public int titleToNumber(String s) {
        
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            result *= 26;
            result += ((int) s.charAt(i)) - 64;
        }
        
        return result;
    }
}
