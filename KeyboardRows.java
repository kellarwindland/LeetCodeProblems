// Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.
// In the American keyboard:
// the first row consists of the characters "qwertyuiop",
// the second row consists of the characters "asdfghjkl", and
// the third row consists of the characters "zxcvbnm".

class Solution {
    public String[] findWords(String[] words) {
        
        final String row1 = "qwertyuiop";
        final String row2 = "asdfghjkl";
        final String row3 = "zxcvbnm";
        
        List<String> resultList = new ArrayList<>();
        
        for(int i = 0; i < words.length; i++){
            int check = -1;
            if(row1.indexOf(Character.toLowerCase(words[i].charAt(0))) != -1){
                check = 0;
            }else if(row2.indexOf(Character.toLowerCase(words[i].charAt(0))) != -1){
                check = 1;
            }else if(row3.indexOf(Character.toLowerCase(words[i].charAt(0))) != -1){
                check = 2; 
            }
            
            boolean valid = true;
            for(int j = 0; j <= words[i].length() - 1; j++){
                
                    if(check == 0 && row1.indexOf(Character.toLowerCase(words[i].charAt(j))) != -1){
                    }else if(check == 1 && row2.indexOf(Character.toLowerCase(words[i].charAt(j))) != -1){
                    }else if(check == 2 && row3.indexOf(Character.toLowerCase(words[i].charAt(j))) != -1){
                    }else{
                        valid = false;
                        break;
                    }
            }
            
            if(valid){
                resultList.add(words[i]);
            }
            
        }
        
        String[] result = new String[resultList.size()];
        result = resultList.toArray(result);
        return result;
    }
}
