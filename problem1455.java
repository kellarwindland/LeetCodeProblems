class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        if(!sentence.contains(searchWord)){
            return -1;
        }
                
        String[] words = sentence.split(" ");
        
        for(int i = 0; i < words.length; i++){
            if(words[i].indexOf(searchWord) == 0){
                return (i + 1);
            }
        }
        
        return -1;
        
        
    }
}
