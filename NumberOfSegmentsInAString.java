// You are given a string s, return the number of segments in the string. 
// A segment is defined to be a contiguous sequence of non-space characters.

class Solution {
    public int countSegments(String s) {
        
        String[] split = s.split("\\s+");
        
        int result = 0;
        for(String temp : split){
            if(temp.length() != 0){
                result++;
            }
        }
        
        return result;
    }
}
