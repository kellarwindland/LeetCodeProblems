// Write a function that takes a string as input and reverse only the vowels of a string.

class Solution {
    public String reverseVowels(String s) {
        
        Stack<Character> chars = new Stack<>();
        String result = "";
        
        for(int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                chars.push(s.charAt(i));
            }
        }
        
        for(int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                result += chars.pop();
            }else{
                result += s.charAt(i);
            }
        }
        
        return result;
    }
    
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
