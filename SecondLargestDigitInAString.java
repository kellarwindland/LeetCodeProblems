// Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.
// An alphanumeric string is a string consisting of lowercase English letters and digits.

class Solution {
    public int secondHighest(String s) {
        
        List<Integer> temp = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                temp.add(Integer.parseInt(String.valueOf(s.charAt(i))));
            }
        }
        
        if(temp.size() < 2){
            return -1;
        }
        
        Collections.sort(temp);
        int result = temp.get(temp.size() - 1);
        
        for(int i = temp.size() - 1; i >= 0; i--){
            if(temp.get(i) < result){
                return temp.get(i);
            }
        }
        
        return -1;
    }
}
