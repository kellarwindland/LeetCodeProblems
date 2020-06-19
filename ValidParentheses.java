// Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if:
// 1. Open brackets must be closed by the same type of brackets.
// 2. Open brackets must be closed in the correct order.
// Note that an empty string is also considered valid.

class Solution {
    public boolean isValid(String s) {

        boolean result = true;
        Stack<Character> sta = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            char pre;
            if(temp == '{' || temp == '[' || temp == '('){
                sta.push(temp);
            }else{
                if(sta.size() != 0){
                    pre = sta.pop();
                    if(pre == '{' && temp != '}'){
                        result = false;
                        break;
                    }else if(pre == '[' && temp != ']'){
                        result = false;
                        break;
                    }else if(pre == '(' && temp != ')'){
                        result = false;
                        break;
                    }
                }else{
                    result = false;
                }
            }
        }
        
        if(sta.size() != 0){
            result = false;
        }
        
        return result;
    }
}
