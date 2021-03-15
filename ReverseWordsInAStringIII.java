// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

class Solution {
    public String reverseWords(String s) {
        
        String result = "";
        String temp = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                temp += s.charAt(i);
            }else if(s.charAt(i) == ' '){
                result += reverse(temp) + ' ';
                temp = "";
            }
        }
        result += reverse(temp);
        return result;   
    }
    
    public String reverse(String s){
        if(s.isEmpty()){
            return s;    
        }
        
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
