// Given a string s and an integer array indices of the same length.
// The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
// Return the shuffled string.

class Solution {
    public String restoreString(String s, int[] indices) {
        
        Map<Integer, Character> map = new HashMap<>();
        String result = "";
        
        for(int i = 0; i < indices.length; i++){
            char index = s.charAt(i);
            map.put(indices[i], index);
        }
        
        for(int i = 0; i < indices.length; i++){
            char index = map.get(i);
            result += index;
        }
        
        return result;
    }
}
