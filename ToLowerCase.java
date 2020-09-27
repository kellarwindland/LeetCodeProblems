// Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.


class Solution {
    public String toLowerCase(String str) {
        
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                int temp = (int) str.charAt(i);
                temp += 32;
                result += (char) temp;
            }else{
                result += str.charAt(i);
            }
        }
        
        return result;
    }
}
