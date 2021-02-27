// Given a string s, the power of the string is the maximum length of
// a non-empty substring that contains only one unique character.
// Return the power of the string.

class Solution {
    public int maxPower(String s) {
        
        int result = 1;
        char lastChar = s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if(lastChar == s.charAt(i)){
                count++;
            }else{
                lastChar = s.charAt(i);
                if(result < count){
                    result = count;
                }
                count = 1;
            }
        }
        
        if(result < count){
            result = count;
        }
        
        return result;
        
    }
}
