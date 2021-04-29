// A pangram is a sentence where every letter of the English alphabet appears at least once.
// Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

class Solution {
    public boolean checkIfPangram(String sentence) {
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < sentence.length(); i++){
            char temp = sentence.charAt(i);
            if(map.containsKey(temp)){
                int index = map.get(temp);
                index++;
                map.put(temp, index);
            }else{
                map.put(temp, 1);
            }
        }
        
        return map.size() == 26;
    }
}
