// You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
// The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
// The interpreted strings are then concatenated in the original order.
// Given the string command, return the Goal Parser's interpretation of command.

class Solution {
    public String interpret(String command) {
        
        String result = "";
        int index = 0;
        
        while(index != -1){
            
            if(command.indexOf("G", index) == index){
                result += "G";
                index += 1;
            }else if(command.indexOf("()", index) == index) {
                result += "o";
                index += 2;
            }else if (command.indexOf("(al)", index) == index) {
                result += "al";
                index += 4;
            }else{
                index = -1;
            }
            
        }
        
        
        return result;
    }
}
