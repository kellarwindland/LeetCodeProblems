// Given an array of string words. Return all strings in words which is substring of another word in any order. 
// String words[i] is substring of words[j], if can be obtained removing some characters to left and/or right side of words[j].

class Solution {
    public List<String> stringMatching(String[] words) {
    
        List<String> result = new ArrayList<String>();
        
        Arrays.sort(words, (word1, word2)->Integer.compare(word1.length(), word2.length()));
        
        for(int i = 0; i < words.length; i++){
            String temp = words[i];
            for(int j = i; j < words.length; j++){
                if(words[j].contains(temp) && !words[j].equals(temp)){
                    result.add(temp);
                    break;
                }
            }
        }
        
        return result;
    }
}
