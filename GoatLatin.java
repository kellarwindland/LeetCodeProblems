// A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.
// We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)
// The rules of Goat Latin are as follows:
// If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
// For example, the word 'apple' becomes 'applema'.
// If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
// For example, the word "goat" becomes "oatgma".
// Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
// For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
// Return the final sentence representing the conversion from S to Goat Latin. 

class Solution {
    
    final String vowel = "AEIOUaeiou";
    
    public String toGoatLatin(String S) {
        
        String[] arr = S.split(" ");
        String append = "a";
        String result = "";
        for(int i = 0; i < arr.length; i++){
            StringBuilder temp = new StringBuilder(arr[i]);
            if(vowel.indexOf(temp.charAt(0)) != -1){
                temp.append("ma");
            }else{
                String c = temp.charAt(0) + "ma";
                temp.deleteCharAt(0);
                temp.append(c);
            }
            temp.append(append);
            result += temp.toString();
            append += "a";
            if(i + 1 < arr.length){
                result += " "; 
            }
        }
        
        return result;
    }
}
