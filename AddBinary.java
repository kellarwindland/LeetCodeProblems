// Given two binary strings, return their sum (also a binary string).
// The input strings are both non-empty and contains only characters 1 or 0.

class Solution {
    public String addBinary(String a, String b) {
        
        String result = "";
        
        StringBuilder a1 = new StringBuilder(); 
        StringBuilder b1 = new StringBuilder();
        
        a1.append(a); 
        b1.append(b);
        
        a1 = a1.reverse();
        b1 = b1.reverse();
        
        int lena = a1.length();
        int lenb = b1.length();
        int maxLen = lena;
        
        if(lenb > maxLen){
            maxLen = lenb;
        }
        char c;
        boolean carry = false;
        for(int i = 0; i < maxLen; i++){
            char tempa = '0';
            char tempb = '0';
            
            if(i <= lena - 1){
                tempa = a1.charAt(i);
            }
            if(i <= lenb - 1){
                tempb = b1.charAt(i);
            }
            if(tempa == '1' && tempb == '1'){
                c = '2';
            }else if(tempa == '0' && tempb == '0'){
                c = '0';
            }else{
                c = '1';
            }
            result = c + result;
        }
        String str = result;
        result = "";
        int len = str.length();
        carry = false;
        for(int i = len - 1; i >= 0; i--){
            char index = str.charAt(i);
            char temp;
            if(carry){
                index++;
            }
            if(index == '2'){
                carry = true;
                temp = '0';
            }else if (index == '3'){
                carry = true;
                temp = '1';
            }else{
                temp = index;
                carry = false;
            }
            result = temp + result;
        }
        if(carry){
            result = '1' + result;
        }
        return result;
  }
}
