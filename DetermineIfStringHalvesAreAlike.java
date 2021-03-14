// You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
// Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
// Notice that s contains uppercase and lowercase letters.
// Return true if a and b are alike. Otherwise, return false.

class Solution {
    public boolean halvesAreAlike(String s) {
        String temp = s.toLowerCase();
        
        int count1 = 0;
        int count2 = 0;
        
        for(int i = 0; i < temp.length() / 2; i++){
            if(isVowel(temp.charAt(i))){
                count1++;
            }
            if(isVowel(temp.charAt(i + (temp.length() / 2)))){
                count2++;
            }
        }
        
        return count1 == count2;
    }
    
    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
