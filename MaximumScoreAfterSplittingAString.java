// Given a string s of zeros and ones, return the maximum score after splitting the string into two non-empty substrings (i.e. left substring and right substring).
// The score after splitting a string is the number of zeros in the left substring plus the number of ones in the right substring.

class Solution {
    public int maxScore(String s) {
        
        int result = 0;
        
        for(int i = 0; i < s.length() - 1; i++){
            String left = s.substring(0, i + 1);
            String right = s.substring(i + 1);
            int count = ( left.split("0", -1).length ) - 1;
            count += ( right.split("1", -1).length ) - 1;
            
            if(count > result){
                result = count;
            }
        }
        
        return result;
    }
}
