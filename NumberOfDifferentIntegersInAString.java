// You are given a string word that consists of digits and lowercase English letters.
// You will replace every non-digit character with a space. For example, "a123bc34d8ef34" will become " 123  34 8  34".
// Notice that you are left with some integers that are separated by at least one space: "123", "34", "8", and "34".
// Return the number of different integers after performing the replacement operations on word.
// Two integers are considered different if their decimal representations without any leading zeros are different.

import java.math.BigInteger;

class Solution {
    public int numDifferentIntegers(String word) {
        
        String curr = "";
        Set<BigInteger> set = new HashSet<>();
        
        for(int i = 0; i < word.length(); i++){
            
            if(Character.isDigit(word.charAt(i))){
                curr += word.charAt(i);
            }else{
                if(!curr.equals("")){
                    set.add(new BigInteger(curr));
                }
                
                curr = "";
            }
            
        }
        
        if(!curr.equals("")){
            set.add(new BigInteger(curr));
        }
        
        return set.size();
    }
}
