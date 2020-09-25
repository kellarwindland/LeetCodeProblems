// Given a valid (IPv4) IP address, return a defanged version of that IP address.
// A defanged IP address replaces every period "." with "[.]".

class Solution {
    public String defangIPaddr(String address) {
        
        String result = "";
        
        for(int i = 0; i < address.length(); i++){
            char index = address.charAt(i);
            if(index == '.'){
                result += "[.]";
            }else{
                result += index;
            }
        }
        
        return result;
    }
}
