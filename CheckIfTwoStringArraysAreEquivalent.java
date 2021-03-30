// Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
// A string is represented by an array if the array elements concatenated in order forms the string.

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String first = "";
        String second = "";
        
        for(String temp : word1){
            first += temp;
        }
        
        for(String temp : word2){
            second += temp;
        }
        
        return first.equals(second);
    }
}
