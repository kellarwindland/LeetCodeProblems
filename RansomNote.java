// Given an arbitrary ransom note string and another string containing letters from all the magazines,
// write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
// Each letter in the magazine string can only be used once in your ransom note.

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(int i = 0; i < ransomNote.length(); i++){
            if(map1.get(ransomNote.charAt(i)) == null){
                map1.put(ransomNote.charAt(i), 1);
            }else{
                int temp = map1.get(ransomNote.charAt(i));
                temp++;
                map1.put(ransomNote.charAt(i), temp);
            }
        }
        
        
        for(int i = 0; i < magazine.length(); i++){
            if(map2.get(magazine.charAt(i)) == null){
                map2.put(magazine.charAt(i), 1);
            }else{
                int temp = map2.get(magazine.charAt(i));
                temp++;
                map2.put(magazine.charAt(i), temp);
            }
        }
        
        for(Map.Entry<Character, Integer> entry : map1.entrySet()){
            
            if(map2.get(entry.getKey()) == null || entry.getValue() > map2.get(entry.getKey())){
                return false;   
            }
        }
        
        return true;
    }
}
