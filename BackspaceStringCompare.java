// Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
// Note that after backspacing an empty text, the text will continue empty.

class Solution {
    public boolean backspaceCompare(String S, String T) {
                
        StringBuilder s = new StringBuilder();
        StringBuilder t = new StringBuilder();
        
        for(int i = 0; i < S.length(); i ++){
            char temp = S.charAt(i);
            if(temp == '#'){
                if(s.length() != 0){
                    s.deleteCharAt(s.length() - 1);
                }
            }else{
                s.append(temp);
            }
        }
        
        for(int i = 0; i < T.length(); i ++){
            char temp = T.charAt(i);
            if(temp == '#'){
                if(t.length() != 0){
                    t.deleteCharAt(t.length() - 1);
                }
            }else{
                t.append(temp);
            }
        }
        
        return s.toString().equals(t.toString());
    }
}
