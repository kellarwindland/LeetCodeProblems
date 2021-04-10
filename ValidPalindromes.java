// Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

class Solution {
    public boolean isPalindrome(String s) {
        
        String temp = "";
        Stack<Character> stack = new Stack<>();
        
        s = s.toLowerCase();
        
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                temp += s.charAt(i);
                stack.push(s.charAt(i));
            }
        }
        
        String temp1 = "";
        
        for(char c : stack){
            temp1 = c + temp1;
        }
        
        return temp.equals(temp1);
    }
}
