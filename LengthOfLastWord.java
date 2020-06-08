// Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
// return the length of last word (last word means the last appearing word if we loop from left to right) in the string.
// If the last word does not exist, return 0.
// Note: A word is defined as a maximal substring consisting of non-space characters only.

class Solution {
    public int lengthOfLastWord(String s) {
     
            int result = 0;
            String[] arr = s.split(" ");
            if(arr.length > 0){
                String resultStr = arr[arr.length - 1];
                System.out.println(resultStr);
                result = resultStr.length();
            }

            return result;
    }
}
