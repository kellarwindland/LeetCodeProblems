// Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.

class Solution {
    public String reverseOnlyLetters(String S) {
        
        StringBuilder temp = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < S.length(); i++){
            if(Character.isLetter(S.charAt(i))){
                stack.push(S.charAt(i));
                temp.append(" ");
            }else{
                temp.append(S.charAt(i));
            }
        }
                
        for(int i = 0; i < S.length(); i++){
            if(Character.isLetter(S.charAt(i))){
                temp.setCharAt(i, stack.pop());
            }
        }
                
        return temp.toString();
    }
}
