// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
// If a string is longer than the other, append the additional letters onto the end of the merged string.
// Return the merged string.

class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String result = "";
        int length = 0;
        String lon = "";
        
        if(word1.length() < word2.length()){
            length = word1.length();
            lon = word2;
        }else{
            length = word2.length();
            lon = word1;
        }
        
        for(int i = 0; i < length; i++){
            result += word1.charAt(i);
            result += word2.charAt(i);
        }
                
        result += lon.substring(length);
        
        return result;
    }
}
